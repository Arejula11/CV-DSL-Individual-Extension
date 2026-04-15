package com.dsl.java_microservice;

import com.google.inject.Injector;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.GeneratorContext;
import org.eclipse.xtext.generator.IGenerator2;
import org.eclipse.xtext.generator.InMemoryFileSystemAccess;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashMap;
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

    @PostMapping("/process-dsl")
    public ResponseEntity<?> processDsl(@RequestBody Map<String, String> payload) {
        String dslText = payload.get("dsl");
        
        try {
            // 1. Preparamos el entorno de Xtext
            XtextResourceSet resourceSet = xtextInjector.getInstance(XtextResourceSet.class);
            
            // IMPORTANTE: La extensión debe coincidir con la de tu DSL (ej: .resume)
            Resource resource = resourceSet.createResource(URI.createURI("dummy.resume")); 
            
            // 2. Cargamos el texto de la web como si fuera un archivo
            InputStream in = new ByteArrayInputStream(dslText.getBytes());
            resource.load(in, resourceSet.getLoadOptions());

            // 3. Validamos si hay errores de sintaxis en el DSL
            if (!resource.getErrors().isEmpty()) {
                System.err.println("Errores de sintaxis en el DSL: " + resource.getErrors());
                return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                        .body("Error de sintaxis en el código DSL proporcionado.");
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
}