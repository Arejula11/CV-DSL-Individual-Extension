
from Models import Profile, Customization


cv = Profile("Emma Johnson")

cv.with_metadata("Minimali", "Calibri", "/assets/profile_pic_emma.jpg")
cv.with_userdata(
    "Emma Johnson", 
    "emma.johnson@email.com", 
    "+1 415 555 9021", 
    "742 Evergreen Terrace", 
    "USA", 
    "San Francisco"
)


education = cv.add_education("en")
education.add_degree("BSc in Computer Science", "University of California, Berkeley", "2018", "USA", ["Bachelor", "Computer Science"])
exp = cv.add_experience("en")
exp.add_job("Senior Backend Engineer", "CloudNova", "2021-02-15", "2024-10-31", ["Designed scalable REST APIs", "Led migration to cloud-native architecture"], ["Backend", "Cloud", "Python"])
exp.add_job("Software Engineer", "DataBridge", "2018-06-01", "2021-01-30", ["Built internal tooling for analytics", "Improved CI/CD pipelines"], ["DevOps", "Automation", "Analytics"])
projects = cv.add_projects("en")
projects.add_project("Smart Task Manager", "https://github.com/emmaj/smart-task-manager", ["Productivity web app with AI-based prioritization"], ["FastAPI", "React", "PostgreSQL"], ["AI", "WebApp"], ["Programming Languages: Python, Java, TypeScript", "Tools: GitHub Actions, Docker, Kubernetes"])
skills = cv.add_skills("en")
skills.add_skill("Programming Languages", ["Python", "Java", "TypeScript"])
skills.add_skill("Tools", ["GitHub Actions", "Docker", "Kubernetes"])
skills = cv.add_skills("es")
skills.add_skill("Lenguajes de programación", ["Python", "Java", "TypeScript"])
cv.add_languages("en").add_languages(["English", "Spanish"])
metrics = cv.add_metrics("en")
metrics.add_metric("Años de experiencia", 5)


customizer = Customization(cv)
    
# 1. El primer filtro define el lenguaje general del CV de forma única
customizer.add_filter("Profile", "LANGUAGE", "en")

# 2. Iteramos para incluir las secciones que se desean con los filtros definidos
customizer.add_filter("Education", "TEMPORAL_BEFORE", "2020")


customizer.add_filter("Experience", "ALL", "None")
customizer.add_filter("Projects", "TAGS", "AI")


cv.build()
