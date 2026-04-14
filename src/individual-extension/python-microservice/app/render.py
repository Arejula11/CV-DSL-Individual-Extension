from pathlib import Path
import sys
import subprocess

def compile_latex(tex_file):
    tex_path = Path(tex_file).resolve()
    workdir = tex_path.parent
    tex_name = tex_path.name

    print("Compiling LaTeX → PDF...")

    try:
        result = subprocess.run(
            ["pdflatex", "-interaction=nonstopmode", tex_name],
            cwd=workdir,
            stdout=subprocess.PIPE,
            stderr=subprocess.PIPE,
            text=True
        )
    except FileNotFoundError:
        print("Error: pdflatex not found. Is LaTeX installed?")
        sys.exit(1)

    if result.returncode != 0:
        print("LaTeX compilation failed:\n")
        print(result.stdout)
        print(result.stderr)
        sys.exit(1)

    print("PDF generated successfully.")


# -----------------------------
# Data containers
# -----------------------------
contact = []
metadata = {}   # dict: { "Style": "Minima", "Font": "Calibri", ... }
education = []
experience = []
projects = []

# -----------------------------
# CLI argument
# -----------------------------
if len(sys.argv) < 2:
    print("Usage: python3 render.py <cv.md>")
    sys.exit(1)

input_file = sys.argv[1]

with open(input_file, "r", encoding="utf-8") as f:
    lines = f.readlines()

# -----------------------------
# Parser state
# -----------------------------
current_section = None
current_subsection = None
userName = None


def flush_subsection():
    global current_subsection
    if not current_subsection:
        return

    if current_section == "Education":
        education.append(current_subsection)
    elif current_section == "Experience":
        experience.append(current_subsection)
    elif current_section == "Projects":
        projects.append(current_subsection)
    # Metadata is handled directly via bullet parsing below, not as subsections

    current_subsection = None


# -----------------------------
# Markdown parsing
# -----------------------------
for line in lines:
    line = line.strip()
    if not line:
        continue

    # Title
    if line.startswith("# "):
        userName = line[2:].strip()
        continue

    # Section
    if line.startswith("## "):
        flush_subsection()
        current_section = line[3:].strip()
        continue

    # Contact information
    if current_section == "Contact Information" and line.startswith("- "):
        key, value = line[2:].split(":", 1)
        contact.append({key.strip(): value.strip()})
        continue

    # Metadata fields
    if current_section == "Metadata" and line.startswith("- "):
        key, value = line[2:].split(":", 1)
        metadata[key.strip()] = value.strip()
        continue

    # Subsection
    if line.startswith("### "):
        flush_subsection()
        current_subsection = {
            "title_org": line[4:].strip(),
            "bullets": []
        }
        continue

    # Date
    if line.startswith("> ") and current_subsection:
        current_subsection["date"] = line[2:].strip()
        continue

    # Bullet
    if line.startswith("- ") and current_subsection:
        current_subsection["bullets"].append(line[2:].strip())
        continue


flush_subsection()

print("Markdown file read. Creating the CV.")

# -----------------------------
# Header generation
# -----------------------------
latex_header = ""

# Note: Using "Style" with a capital S because the markdown parser preserves case from the key.
style_name = metadata.get("Style", "minimal").strip().lower()
contacts_len = len(contact)

if style_name == "minimal":
    latex_header += f"\\textbf{{\\fontsize{{25 pt}}{{25 pt}}\\selectfont {userName}}}\n"
    latex_header += "\n\\vspace{5 pt}\n"
    latex_header += "\\normalsize\n"

    for i, info in enumerate(contact):
        for key, value in info.items():
            if key == "Email":
                latex_header += f"\\mbox{{\\hrefWithoutArrow{{mailto:{value}}}{{\\texttt{{{value}}}}}}}%\n"
            elif key == "Phone":
                latex_header += f"\\mbox{{\\hrefWithoutArrow{{tel:{value}}}{{{value}}}}}%\n"
            elif key == "Linkedin":
                latex_header += f"\\mbox{{\\hrefWithoutArrow{{{value}}}{{\\texttt{{LinkedIn}}}}}}%\n"
            elif key == "GitHub":
                latex_header += f"\\mbox{{\\hrefWithoutArrow{{{value}}}{{\\texttt{{GitHub}}}}}}%\n"
            else:
                latex_header += f"\\mbox{{\\hrefWithoutArrow{{{value}}}{{\\texttt{{{key}}}}}}}%\n"

            if i < contacts_len - 1:
                latex_header += "\\kern 5.0 pt%\n\\AND%\n\\kern 5.0 pt%\n"

elif style_name == "modern":
    latex_header += f"\\textbf{{\\fontsize{{27 pt}}{{29 pt}}\\selectfont {userName}}}\n"
    latex_header += "\n\\vspace{5 pt}\n"
    latex_header += "\\small\\color{mutedText}\n"
    
    for i, info in enumerate(contact):
        for key, value in info.items():
            key_normalized = key.strip().lower()

            if key_normalized == "email":
                latex_header += f"\\mbox{{\\hrefWithoutArrow{{mailto:{value}}}{{\\texttt{{{value}}}}}}}%\n"
            elif key_normalized == "phone":
                latex_header += f"\\mbox{{\\hrefWithoutArrow{{tel:{value}}}{{{value}}}}}%\n"
            elif key_normalized == "linkedin":
                latex_header += f"\\mbox{{\\hrefWithoutArrow{{{value}}}{{\\texttt{{LinkedIn}}}}}}%\n"
            elif key_normalized == "github":
                latex_header += f"\\mbox{{\\hrefWithoutArrow{{{value}}}{{\\texttt{{GitHub}}}}}}%\n"
            else:
                latex_header += f"\\mbox{{\\hrefWithoutArrow{{{value}}}{{\\texttt{{{key}}}}}}}%\n"

            if i < contacts_len - 1:
                latex_header += "\\kern 6.0pt{\\color{accentColor}$\\cdot$}\\kern 6.0pt%\n"

print("Header created.")

# -----------------------------
# Education
# -----------------------------
latex_education = ""

for i, entry in enumerate(education):
    date = entry.get("date", "")
    title = entry["title_org"]

    name, org = (title.split("|", 1) + [""])[:2]
    name = name.strip()
    org = org.strip()

    latex_education += f"\\begin{{twocolentry}}{{{date}}}\n"
    latex_education += f"\\textbf{{{name}}}, {org}\n"
    latex_education += "\\end{twocolentry}\n\n"

    if len(entry["bullets"]) > 0:
        latex_education += "\\vspace{0.10 cm}\n"
        latex_education += "\\begin{onecolentry}\n"
        latex_education += "\\begin{highlights}\n"

        for bullet in entry["bullets"]:
            if bullet.startswith("Coursework:"):
                bullet = bullet.replace("Coursework:", "\\textbf{Coursework:}")
            latex_education += f"\\item {bullet}\n"

        latex_education += "\\end{highlights}\n"
        latex_education += "\\end{onecolentry}\n"

    if i < len(education) - 1:
        latex_education += "\\vspace{0.20 cm}\n"

print("Education section created.")

# -----------------------------
# Experience
# -----------------------------
latex_experience = ""

for i, entry in enumerate(experience):
    date = entry.get("date", "")
    title = entry["title_org"]

    name, org = (title.split("|", 1) + [""])[:2]
    name = name.strip()
    org = org.strip()

    latex_experience += f"\\begin{{twocolentry}}{{{date}}}\n"
    latex_experience += f"\\textbf{{{name}}}, {org}\n"
    latex_experience += "\\end{twocolentry}\n\n"

    latex_experience += "\\vspace{0.10 cm}\n"
    latex_experience += "\\begin{onecolentry}\n"
    latex_experience += "\\begin{highlights}\n"

    for bullet in entry["bullets"]:
        latex_experience += f"\\item {bullet}\n"

    latex_experience += "\\end{highlights}\n"
    latex_experience += "\\end{onecolentry}\n"

    if i < len(experience) - 1:
        latex_experience += "\\vspace{0.10 cm}\n"

print("Experience section created.")

# -----------------------------
# Projects
# -----------------------------
latex_projects = ""

for entry in projects:
    title = entry["title_org"]
    name, short_link, link = (title.split("|", 2) + [""])[:3]
    name = name.strip()
    short_link = short_link.strip()
    link = link.strip()

    latex_projects += "\\vspace{0.10 cm}\n"

    if link:
        latex_projects += (
            f"\\begin{{twocolentry}}{{\\href{{{link}}}{{{short_link}}}}}\\textbf{{{name}}}\n"
        )
    else:
        latex_projects += f"\\begin{{twocolentry}}{{\\textbf{{{name}}}}}\n"

    latex_projects += "\\end{twocolentry}\n\n"

    latex_projects += "\\vspace{0.10 cm}\n"
    latex_projects += "\\begin{onecolentry}\n"
    latex_projects += "\\begin{highlights}\n"

    tools = entry["bullets"][-1].replace("Tools Used:", "\\textbf{Tools Used:}")
    for bullet in entry["bullets"][:-2]:
        latex_projects += f"\\item {bullet}\n"
    latex_projects += f"\\item {entry['bullets'][-2]} {tools}\n"
    latex_projects += "\\end{highlights}\n"
    latex_projects += "\\end{onecolentry}\n"

print("Projects section created.")

# -----------------------------
# Template filling
# -----------------------------

# Map style names (case-insensitive) to their template filenames
STYLE_TO_TEMPLATE = {
    "minimal": "minimalLatexTemplate.tex",
    "modern":   "modernLatexTemplate.tex",
}

selected_style = metadata.get("Style", "").strip().lower()
template_filename = STYLE_TO_TEMPLATE.get(selected_style)

raw_image_path = metadata.get("Image Path", "").strip()
latex_image_path = "__MISSING_IMAGE__"
if raw_image_path:
    script_dir = Path(__file__).resolve().parent
    normalized_image_path = raw_image_path[1:] if raw_image_path.startswith("/") else raw_image_path

    raw_path = Path(raw_image_path)
    normalized_path = Path(normalized_image_path)

    candidates = []
    if raw_path.is_absolute():
        candidates.append(raw_path)
    else:
        candidates.append((script_dir / raw_path).resolve())

    candidates.append((script_dir / normalized_path).resolve())

    # If path was provided from repo root (e.g. /assets/photo.jpg), also try ancestors.
    for parent in script_dir.parents:
        candidates.append((parent / normalized_path).resolve())

    def _with_extension_fallback(path_obj):
        if path_obj.exists():
            return path_obj
        for ext in (".jpg", ".jpeg", ".png", ".webp"):
            alt = path_obj.with_suffix(ext)
            if alt.exists():
                return alt
        return None

    for candidate in candidates:
        resolved = _with_extension_fallback(candidate)
        if resolved:
            latex_image_path = resolved.as_posix()
            break

if template_filename is None:
    available = ", ".join(f'"{k}"' for k in STYLE_TO_TEMPLATE)
    print(
        f"Warning: unknown style \"{metadata.get('Style', '')}\". "
        f"Available styles: {available}. Falling back to \"minimal\"."
    )
    template_filename = STYLE_TO_TEMPLATE["minimal"]

template_file = "./input/" + template_filename
output_file = "./output/output_cv.tex"

with open(template_file, "r", encoding="utf-8") as f:
    template = f.read()

template = template.replace("{{HEADER}}", latex_header)
template = template.replace("{{EDUCATION}}", latex_education)
template = template.replace("{{EXPERIENCE}}", latex_experience)
template = template.replace("{{PROJECTS}}", latex_projects)
template = template.replace("{{IMAGE_PATH}}", latex_image_path)

with open(output_file, "w", encoding="utf-8") as f:
    f.write(template)

print(f"CV LaTeX generated: {output_file}")

# Compile LaTeX to PDF 
compile_latex(output_file)