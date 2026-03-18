class Metadata:
    def __init__(self, style: str, font: str, img_path: str):
        self.style = style
        self.font = font
        self.img_path = img_path

class UserData:
    def __init__(self, name, email, telephone, direction, country, city):
        self.name = name
        self.email = email
        self.telephone = telephone
        self.direction = direction
        self.country = country
        self.city = city

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

    def with_metadata(self, style, font, imgPath):
        self.metadata = Metadata(style, font, imgPath)
        return self

    def with_userdata(self, name, email, telephone, direction, country, city):
        self.userdata = UserData(name, email, telephone, direction, country, city)
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

        print(f"==========================================")
        print(f"CV DE: {self.userdata.name if self.userdata else self.name}")
        print(f"==========================================")
        print(f"User Data: {self.userdata.email if self.userdata else 'N/A'} | {self.userdata.telephone if self.userdata else 'N/A'} | {self.userdata.direction if self.userdata else 'N/A'}, {self.userdata.city if self.userdata else 'N/A'}, {self.userdata.country if self.userdata else 'N/A'}")
        print(f"==========================================")
        
        for section in self.sections:
            tipo = section.section_type
            print(f"\n--- SECCIÓN: {tipo} ({section.language}) ---")
            
            if isinstance(section, Experience):
                for job in section.jobs:
                    print(f"  * {job.title} en {job.company} ({job.start_date} - {job.end_date})")
            
            elif isinstance(section, Education):
                for degree in section.degrees:
                    print(f"  * {degree.title} en {degree.institution} ({degree.graduation_date})")
            
            elif isinstance(section, Projects):
                for p in section.projects:
                    print(f"  * {p.title} (Link: {p.link})")
                    if p.referenced_skills:
                        print(f"    Skills aplicadas:")
                        for ref in p.referenced_skills:
                            print(f"      - {ref}")
            
            elif isinstance(section, Skills):
                for skill in section.skills:
                    print(f"  * {skill.title}: {', '.join(skill.attributes)}")

            elif isinstance(section, Interests):
                for interest in section.values:
                    print(f"  * {interest}")
            
            elif isinstance(section, Languages):
                for language in section.values:
                    print(f"  * {language}")
            
            # --- NUEVA LÓGICA DE IMPRESIÓN PARA METRICS ---
            elif isinstance(section, Metrics):
                for metric in section.metrics_list:
                    print(f"  * {metric.name}: {metric.value}")
                    
        print(f"\n==========================================")
        return self