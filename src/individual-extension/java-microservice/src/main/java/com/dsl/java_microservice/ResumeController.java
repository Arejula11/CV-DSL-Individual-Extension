package com.dsl.java_microservice;

import com.google.inject.Injector;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.xtext.diagnostics.Severity;
import org.eclipse.xtext.generator.GeneratorContext;
import org.eclipse.xtext.generator.IGenerator2;
import org.eclipse.xtext.generator.InMemoryFileSystemAccess;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class ResumeController {

    @Value("${PYTHON_SERVICE_URL:http://python-service:8000/generate-pdf}")
    private String pythonServiceUrl;

    private final RestTemplate restTemplate = new RestTemplate();

    // Inyectamos el motor de Xtext que creamos en el paso anterior
    @Autowired
    private Injector xtextInjector;

    @PostMapping("/validate-dsl")
    public ResponseEntity<?> validateDsl(@RequestBody Map<String, String> payload) {
        String dslText = payload.get("dsl");
        if (dslText == null) {
            return ResponseEntity.badRequest().body(Map.of("message", "Missing 'dsl' field in request body."));
        }

        try {
            Resource resource = createResourceFromDsl(dslText);
            List<Map<String, Object>> issues = mapIssues(resource);
            return ResponseEntity.ok(Map.of("issues", issues));
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(Map.of("message", "Error validating the DSL: " + e.getMessage()));
        }
    }

    @PostMapping("/process-dsl")
    public ResponseEntity<?> processDsl(@RequestBody Map<String, String> payload) {
        String dslText = payload.get("dsl");
        
        try {
            Resource resource = createResourceFromDsl(dslText);
            List<Map<String, Object>> issues = mapIssues(resource);

            boolean hasErrors = issues.stream()
                    .anyMatch(issue -> "error".equals(issue.get("severity")));
            if (hasErrors) {
                return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                        .body(Map.of(
                                "message", "El DSL contiene errores. Corrigelos antes de compilar.",
                                "issues", issues
                        ));
            }

            // 4. Ejecutamos el generador de Xtext en memoria (sin crear archivos físicos)
            IGenerator2 generator = xtextInjector.getInstance(IGenerator2.class);
            InMemoryFileSystemAccess fsa = xtextInjector.getInstance(InMemoryFileSystemAccess.class);
            generator.doGenerate(resource, fsa, new GeneratorContext());

            // 5. Extraemos el código Python generado
            // Coge el primer archivo que haya generado tu gramática
            String pythonCode = fsa.getTextFiles().values().iterator().next().toString();
            System.out.println("Código Python generado por Xtext:\n" + pythonCode);

            // 6. Enviamos el Python a FastAPI
            Map<String, String> pythonPayload = new HashMap<>();
            pythonPayload.put("code", pythonCode);

            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            HttpEntity<Map<String, String>> request = new HttpEntity<>(pythonPayload, headers);

            ResponseEntity<byte[]> response = restTemplate.exchange(
                    pythonServiceUrl,
                    HttpMethod.POST,
                    request,
                    byte[].class
            );

            // 7. Devolvemos el PDF al usuario
            HttpHeaders responseHeaders = new HttpHeaders();
            responseHeaders.setContentType(MediaType.APPLICATION_PDF);
            return new ResponseEntity<>(response.getBody(), responseHeaders, HttpStatus.OK);

        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Error procesando el DSL: " + e.getMessage());
        }
    }

    private Resource createResourceFromDsl(String dslText) throws Exception {
        XtextResourceSet resourceSet = xtextInjector.getInstance(XtextResourceSet.class);
        Resource resource = resourceSet.createResource(URI.createURI("dummy.resume"));
        InputStream in = new ByteArrayInputStream(dslText.getBytes());
        resource.load(in, resourceSet.getLoadOptions());
        return resource;
    }

    private List<Map<String, Object>> mapIssues(Resource resource) {
        List<Map<String, Object>> issues = new ArrayList<>();

        // Syntax/linking diagnostics generated by the parser.
        for (Diagnostic error : resource.getErrors()) {
            Map<String, Object> mappedIssue = new HashMap<>();
            mappedIssue.put("severity", "error");
            mappedIssue.put("message", error.getMessage());
            mappedIssue.put("line", error.getLine() <= 0 ? 1 : error.getLine());
            mappedIssue.put("column", error.getColumn() <= 0 ? 1 : error.getColumn());
            mappedIssue.put("length", 1);
            issues.add(mappedIssue);
        }

        for (Diagnostic warning : resource.getWarnings()) {
            Map<String, Object> mappedIssue = new HashMap<>();
            mappedIssue.put("severity", "warning");
            mappedIssue.put("message", warning.getMessage());
            mappedIssue.put("line", warning.getLine() <= 0 ? 1 : warning.getLine());
            mappedIssue.put("column", warning.getColumn() <= 0 ? 1 : warning.getColumn());
            mappedIssue.put("length", 1);
            issues.add(mappedIssue);
        }

        IResourceValidator validator = xtextInjector.getInstance(IResourceValidator.class);
        List<Issue> validationIssues = validator.validate(resource, CheckMode.ALL, null);

        for (Issue issue : validationIssues) {
            Map<String, Object> mappedIssue = new HashMap<>();
            mappedIssue.put("severity", mapSeverity(issue.getSeverity()));
            mappedIssue.put("message", issue.getMessage());
            mappedIssue.put("line", issue.getLineNumber() == null ? 1 : issue.getLineNumber());
            mappedIssue.put("column", issue.getColumn() == null ? 1 : issue.getColumn());
            mappedIssue.put("length", issue.getLength() == null ? 1 : issue.getLength());
            issues.add(mappedIssue);
        }

        return issues;
    }

    private String mapSeverity(Severity severity) {
        if (severity == null) {
            return "info";
        }
        return switch (severity) {
            case ERROR -> "error";
            case WARNING -> "warning";
            default -> "info";
        };
    }
}