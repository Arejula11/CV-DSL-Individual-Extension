from pathlib import Path
import subprocess
import sys
import tempfile
from urllib.parse import urlparse

class Metadata:
    def __init__(self, style: str, font: str, img_path: str):
        self.style = style
        self.font = font
        self.img_path = img_path

class UserData:
    def __init__(self, name, email, linkedin, telephone, direction, country, city, github=None, blog=None):
        self.name = name
        self.email = email
        self.linkedin = linkedin
        self.telephone = telephone
        self.direction = direction
        self.country = country
        self.city = city
        self.linkedin = linkedin
        self.github = github
        self.blog = blog

class Job:
    def __init__(self, title, company, start_date, end_date, description, tags):
        self.title = title
        self.company = company
        self.start_date = start_date
        self.end_date = end_date
        self.description = description 
        self.tags = tags    

class Project:
    def __init__(self, title, link, description, technologies, tags, referenced_skills=None):
        self.title = title
        self.link = link
        self.description = description
        self.technologies = technologies
        self.tags = tags
        self.referenced_skills = referenced_skills or []

class Degree:
    def __init__(self, title, institution, graduation_date, country, tags):
        self.title = title
        self.institution = institution
        self.graduation_date = graduation_date
        self.country = country
        self.tags = tags

class Skill:
    def __init__(self, title, attributes):
        self.title = title
        self.attributes = attributes

# --- NUEVA CLASE PARA METRICS ---
class Metric:
    def __init__(self, name, value):
        self.name = name
        self.value = value


class Section:
    def __init__(self, language, parent):
        self.language = language
        self.parent = parent

    def end_section(self):
        return self.parent

class Experience(Section):
    def __init__(self, language, parent):
        super().__init__(language, parent)
        self.jobs = []
        self.section_type = "Experience"

    def add_job(self, title, company, start_date, end_date, description=None, tags=None):
        new_job = Job(title, company, start_date, end_date, description or [], tags or [])
        self.jobs.append(new_job)
        return self

class Projects(Section):
    def __init__(self, language, parent):
        super().__init__(language, parent)
        self.projects = []
        self.section_type = "Projects"
        
    def add_project(self, title, link, description=None, technologies=None, tags=None, referenced_skills=None):
        new_project = Project(title, link, description or [], technologies or [], tags or [], referenced_skills or [])
        self.projects.append(new_project)
        return self


class Education(Section):
    def __init__(self, language, parent):
        super().__init__(language, parent)
        self.degrees = []
        self.section_type = "Education"

    def add_degree(self, title, institution, graduation_date, country, tags=None):
        new_degree = Degree(title, institution, graduation_date, country, tags or [])
        self.degrees.append(new_degree)
        return self

class Skills(Section):
    def __init__(self, language, parent):
        super().__init__(language, parent)
        self.skills = []
        self.section_type = "Skills"

    def add_skill(self, title, attributes):
        self.skills.append(Skill(title, attributes))
        return self

class Interests(Section):
    def __init__(self, language, parent):
        super().__init__(language, parent)
        self.values = []
        self.section_type = "Interests"

    def add_interests(self, values: list):
        self.values.extend(values)
        return self

class Languages(Section):
    def __init__(self, language, parent):
        super().__init__(language, parent)
        self.values = []
        self.section_type = "Languages"

    def add_languages(self, values: list):
        self.values.extend(values)
        return self

# --- NUEVA SECCIÓN PARA METRICS ---
class Metrics(Section):
    def __init__(self, language, parent):
        super().__init__(language, parent)
        self.metrics_list = []
        self.section_type = "Metrics"

    def add_metric(self, name, value):
        self.metrics_list.append(Metric(name, value))
        return self
        
class Customization:
    def __init__(self, profile):
        self.profile = profile
        self.filters = []
        self.profile.customizer = self

    def add_filter(self, section_name, filter_type, value):
        self.filters.append({'section': section_name, 'type': filter_type, 'value': value})
        return self
    
    def apply_filters(self):
        included_names = {f['section'] for f in self.filters}
        
        lang_filters = [f['value'] for f in self.filters if f['type'] == "LANGUAGE"]
        
        self.profile.sections = [
            s for s in self.profile.sections 
            if s.section_type in included_names and (not lang_filters or s.language in lang_filters)
        ]

        for f in [f for f in self.filters if f['type'] == "TAGS"]:
            for section in self.profile.sections:
                if section.section_type == f['section']:
                    if hasattr(section, "jobs"):
                        section.jobs = [j for j in section.jobs if f['value'] in j.tags]
                    elif hasattr(section, "projects"):
                        section.projects = [p for p in section.projects if f['value'] in p.tags]
                    elif hasattr(section, "degrees"):
                        section.degrees = [d for d in section.degrees if f['value'] in d.tags]
                    elif hasattr(section, "skills"):
                        section.skills = [s for s in section.skills if s.title.upper() == f['value'].upper()]
                    elif hasattr(section, "values"):
                        section.values = [v for v in section.values if v.upper() == f['value'].upper()]


class Profile:
    def __init__(self, name):
        self.name = name
        self.metadata = None
        self.userdata = None
        self.sections = []
        self.customizer = None # Añadido por seguridad para evitar errores si no hay Customization

    def with_metadata(self, style, font, img_path):
        self.metadata = Metadata(style, font, img_path)
        return self

    def with_userdata(self, name, email, linkedin, telephone, direction, country, city, github=None, blog=None):
        self.userdata = UserData(name, email, linkedin, telephone, direction, country, city, github, blog)
        return self

    def add_experience(self, language):
        section = Experience(language, self)
        self.sections.append(section)
        return section

    def add_projects(self, language):
        section = Projects(language, self)
        self.sections.append(section)
        return section

    def add_education(self, language):
        section = Education(language, self)
        self.sections.append(section)
        return section

    def add_skills(self, language):
        section = Skills(language, self)
        self.sections.append(section)
        return section

    def add_interests(self, language):
        section = Interests(language, self)
        self.sections.append(section)
        return section

    def add_languages(self, language):
        section = Languages(language, self)
        self.sections.append(section)
        return section

    # --- NUEVO MÉTODO PARA METRICS ---
    def add_metrics(self, language):
        section = Metrics(language, self)
        self.sections.append(section)
        return section

    def build(self):
        if self.customizer:
            self.customizer.apply_filters()

        def _date_range(start_date, end_date):
            if start_date and end_date:
                return f"{start_date} - {end_date}"
            return start_date or end_date or ""

        def _project_short_link(link):
            if not link:
                return ""
            parsed = urlparse(link if "://" in link else f"https://{link}")
            host = parsed.netloc or parsed.path
            path = parsed.path if parsed.netloc else ""
            short_link = f"{host}{path}".strip("/")
            return short_link or link

        markdown_lines = []
        markdown_lines.append(f"# {self.userdata.name if self.userdata else self.name}")
        markdown_lines.append("## Metadata")
        if self.metadata:
            markdown_lines.append(f"- Style: {self.metadata.style}")
            markdown_lines.append(f"- Font: {self.metadata.font}")
            markdown_lines.append(f"- Image Path: {self.metadata.img_path}")
        markdown_lines.append("## Contact Information")
        markdown_lines.append(f"- Email: {self.userdata.email if self.userdata else 'N/A'}")
        markdown_lines.append(f"- Phone: {self.userdata.telephone if self.userdata else 'N/A'}")
        if self.userdata and self.userdata.linkedin:
            markdown_lines.append(f"- LinkedIn: {self.userdata.linkedin}")
        if self.userdata and self.userdata.github:
            markdown_lines.append(f"- GitHub: {self.userdata.github}")
        if self.userdata and self.userdata.blog:
            markdown_lines.append(f"- Blog: {self.userdata.blog}")

        for section in self.sections:
            tipo = section.section_type
            markdown_lines.append("")
            markdown_lines.append(f"## {tipo}")

            if isinstance(section, Experience):
                for job in section.jobs:
                    markdown_lines.append("")
                    markdown_lines.append(f"### {job.title} | {job.company}")
                    markdown_lines.append(f"> {_date_range(job.start_date, job.end_date)}")
                    for line in job.description:
                        markdown_lines.append(f"- {line}")

            elif isinstance(section, Education):
                for degree in section.degrees:
                    title_line = degree.title
                    if degree.institution:
                        title_line = f"{degree.title} | {degree.institution}"
                    markdown_lines.append("")
                    markdown_lines.append(f"### {title_line}")
                    if degree.graduation_date:
                        markdown_lines.append(f"> {degree.graduation_date}")
                    for tag in degree.tags:
                        markdown_lines.append(f"- {tag}")
            
            elif isinstance(section, Projects):
                for p in section.projects:
                    header = f"{p.title}"
                    if p.link:
                        header = f"{header} | Link| {p.link}"
                    markdown_lines.append("")
                    markdown_lines.append(f"### {header}")
                    for line in p.description:
                        markdown_lines.append(f"- {line}")
                    if p.technologies:
                        markdown_lines.append(f"- Tools Used: {', '.join(p.technologies)}.")
                    if p.referenced_skills:
                        for ref in p.referenced_skills:
                            markdown_lines.append(f"  -{ref}")
            
            elif isinstance(section, Skills):
                for skill in section.skills:
                    markdown_lines.append(f"- {skill.title}: {', '.join(skill.attributes)}")

            elif isinstance(section, Interests):
                for interest in section.values:
                    markdown_lines.append(f"- {interest}")
            
            elif isinstance(section, Languages):
                for language in section.values:
                    markdown_lines.append(f"- {language}")
            
            # --- NUEVA LÓGICA DE IMPRESIÓN PARA METRICS ---
            elif isinstance(section, Metrics):
                for metric in section.metrics_list:
                    markdown_lines.append(f"- {metric.name}: {metric.value}")

        markdown_content = "\n".join(markdown_lines).rstrip() + "\n"

        script_dir = Path(__file__).resolve().parent
        render_script = script_dir / "render.py"

        with tempfile.NamedTemporaryFile("w", suffix=".md", delete=False, encoding="utf-8", dir=script_dir) as temp_markdown:
            temp_markdown.write(markdown_content)
            markdown_path = Path(temp_markdown.name)

        try:
            subprocess.run(
                [sys.executable, str(render_script), str(markdown_path)],
                cwd=script_dir,
                check=True,
            )
        finally:
            try:
                markdown_path.unlink(missing_ok=True)
            except OSError:
                pass

        return self