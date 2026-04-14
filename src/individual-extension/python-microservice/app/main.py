from fastapi import FastAPI, HTTPException, BackgroundTasks
from fastapi.responses import FileResponse
from pydantic import BaseModel
from pathlib import Path
import sys

app = FastAPI()

class CodePayload(BaseModel):
    code: str

# Calculamos la ruta base de la carpeta 'app' (donde está este main.py)
BASE_DIR = Path(__file__).resolve().parent
OUTPUT_DIR = BASE_DIR / "output"


if str(BASE_DIR) not in sys.path:
    sys.path.append(str(BASE_DIR))

def cleanup_output_folder():
    # LaTeX suele generar archivos auxiliares extra (.aux, .out), los añadimos por seguridad
    archivos_latex = [
        "output.pdf", "output.tex", "output.log", "output.aux", "output.out",
        "output_cv.pdf", "output_cv.tex", "output_cv.log", "output_cv.aux", "output_cv.out",
    ]
    for archivo in archivos_latex:
        file_path = OUTPUT_DIR / archivo
        if file_path.exists():
            try:
                file_path.unlink() # Método seguro para borrar el archivo
            except Exception as e:
                print(f"No se pudo borrar {file_path}: {e}")

@app.post("/generate-pdf")
async def generate_pdf(payload: CodePayload, background_tasks: BackgroundTasks):
    local_env = {}
    
    try:
        exec_globals = {
            "__builtins__": __builtins__,
        }
        
        # Ejecutamos el código recibido dinámicamente
        exec(payload.code, exec_globals, local_env)
        
        if "cv" not in local_env:
            raise ValueError("El script no ha definido la variable 'cv'")
            
        cv_instance = local_env["cv"]
        cv_instance.build()
        
        # Buscamos el PDF usando la ruta absoluta calculada.
        # `render.py` genera `output_cv.pdf`, pero mantenemos compatibilidad con `output.pdf`.
        output_candidates = [
            OUTPUT_DIR / "output_cv.pdf",
            OUTPUT_DIR / "output.pdf",
        ]
        output_pdf_path = next((path for path in output_candidates if path.exists()), None)

        if output_pdf_path is None:
            raise FileNotFoundError(
                "No se encontró el PDF en las rutas: "
                + ", ".join(str(path) for path in output_candidates)
            )

        # Programamos la limpieza de la carpeta 'app/output'
        background_tasks.add_task(cleanup_output_folder)

        return FileResponse(
            path=str(output_pdf_path), 
            media_type="application/pdf",
            filename="curriculum.pdf"
        )
        
    except Exception as e:
        message = str(e).strip() or "Error desconocido"
        raise HTTPException(status_code=400, detail=f"Error ejecutando el script: {message}")