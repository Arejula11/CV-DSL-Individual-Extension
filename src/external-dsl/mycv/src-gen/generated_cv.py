
from Models import Profile, Customization


cv = Profile("Miguel Aréjula Aísa")

cv.with_metadata("Minimal", "Calibri", "/assets/profile_pic_are.jpg")
cv.with_userdata(
    "Miguel Aréjula Aísa", 
    "arejula10@email.com", 
    "linkedin.com/miguelarejula",
    "+34 601491089", 
    "Østerbro", 
    "Denmark", 
    "Odense"
)


education = cv.add_education("en")
education.add_degree("Master in Software Engineering", "University of Southern Denmark", "June 2027", "Denmark", ["Coursework: Advanced Software Engineering Methodologies, Advanced Software Architecture and Analysis Techniques, Big Data and Data Science Technology"])
education.add_degree("BSc in Computer Science", "University of Zaragoza", "June 2021", "Spain", ["Coursework: Software Engineer, Distributed Systems, Software Architecture, Prerequisite Engineering, Verification and Validation, Agile Methodologies and Quality, and Artificial Intelligence.", "Achieved high honors in Information Systems II and Verification and Validation, demonstrating exceptional proficiency and understanding in these subjects."])
education.add_degree("Cambridge English  Advance", "Cambridge", "July 2024", "Spain", [""])
education = cv.add_education("es")
education.add_degree("Máster en Ingeniería de Software", "Universidad de Southern Denmark", "Junio 2027", "Dinamarca", ["Asignaturas: Advanced Software Engineering Methodologies, Advanced Software Architecture and Analysis Techniques, Big Data and Data Science Technology"])
education.add_degree("Grado en Ingeniería Informática", "Universidad de Zaragoza", "Junio 2021", "España", ["Asignaturas: Software Engineer, Distributed Systems, Software Architecture, Prerequisite Engineering, Verification and Validation, Agile Methodologies and Quality, and Artificial Intelligence.", "Achieved high honors in Information Systems II and Verification and Validation, demonstrating exceptional proficiency and understanding in these subjects."])
education.add_degree("Cambridge English  Advance", "Cambridge", "July 2024", "España", [""])
exp = cv.add_experience("en")
exp.add_job("Software Engineer", "University of Zaragoza", "2024-06-01", "2025-08-31", ["Led development of custom web application for Traumatology Department", "Developed full-stack system using React, PostgreSQL, Express, and FastAPI", "Integrated clinical data into relational model for clinical pathway validation"], ["Backend", "Frontend", "React", "PostgreSQL", "FastAPI"])
exp.add_job("Teaching Assistant", "University of Southern Denmark", "2026-02-01", "2026-06-01", ["Support students in understanding core software architecture concepts by assisting with lab sessions, assignments, and problem-solving, while clearly explaining technical concepts and collaborating with professors."], ["Teaching", "Software Architecture", "Student Support"])
projects = cv.add_projects("en")
projects.add_project("Are-Dev", "are-dev.es", ["Personal technical blog and YouTube channel focused on software development, front-end technologies, and modern frameworks", "Published blog posts and videos sharing tutorials, project walk-throughs, and insights to engage the developer community"], ["Astro", "Vercel", "Markdown"], ["Astro", "Vercel", "Markdown", "Blog", "YouTube"], [])
projects.add_project("I4 Pizza Production System", "github.com/The-European-Avengers/pizza-i4-architecture-group2", ["Industry 4.0 pizza production system integrating warehouse, production line, and web platform via distributed architecture", "Designed, validated, and documented system architecture using ADD with requirements, use cases, microservice boundaries, and formal verification with UPPAAL", "Led system-level coordination, ensured architectural consistency, and supervised implementation"], ["Go", "Python", "Kafka", "Docker", "UPPAAL"], ["Go", "Python", "Kafka", "Docker", "UPPAAL", "Industry 4.0", "Distributed Systems", "Software Architecture"], [])
projects.add_project("AgroNet", "github.com/STW-24-25", ["Full-stack collaborative web platform for farmers integrating real-time market prices, personalized weather alerts, and interactive geospatial data visualization", "Led front-end team development and deployed on Vercel", "Managed backend communication hosted on AWS ensuring reliable API integration and real-time data synchronization"], ["Astro", "NodeJs", "TypeScript", "MongoDB", "AWS", "Vercel"], ["Astro", "NodeJs", "TypeScript", "MongoDB", "AWS", "Vercel", "Web Development", "Full-Stack", "Agriculture Technology"], ["Methodologies: Agile, Scrum, ADD, Formal Verification", "Tools: GitHub Actions, Docker, Kubernetes"])
projects.add_project("Energy Price Prediction", "github.com/The-European-Avengers/BigDataProject", ["Analyzed Danish Meteorological Institute weather datasets and national energy consumption/price data to forecast electricity prices", "Applied big data frameworks and machine learning models to process large-scale datasets for predictive analytics covering renewable energy impact, peak price periods, and seasonal patterns"], ["Kafka", "HDFS", "Kubernetes", "Hive", "Spark", "Python"], ["Kafka", "HDFS", "Kubernetes", "Hive", "Spark", "Python", "Big Data", "Machine Learning", "Energy Forecasting"], ["Tools: GitHub Actions, Docker, Kubernetes"])
projects = cv.add_projects("es")
projects.add_project("Are-Dev", "are-dev.es", ["Blog técnico personal y canal de YouTube centrado en desarrollo de software, tecnologías front-end y frameworks modernos", "Publicación de artículos y videos compartiendo tutoriales, walkthroughs de proyectos e insights para la comunidad de desarrolladores"], ["Astro", "Vercel", "Markdown"], ["Astro", "Vercel", "Markdown", "Blog", "YouTube"], [])
projects.add_project("Sistema de Producción de Pizza I4", "github.com/The-European-Avengers/pizza-i4-architecture-group2", ["Sistema de producción de pizza Industria 4.0 integrando almacén, línea de producción y plataforma web mediante arquitectura distribuida", "Diseño, validación y documentación de la arquitectura del sistema utilizando ADD con requisitos, casos de uso, límites de microservicios y verificación formal con UPPAAL", "Liderazgo en coordinación a nivel sistema, asegurando consistencia arquitectónica y supervisión de implementación"], ["Go", "Python", "Kafka", "Docker", "UPPAAL"], ["Go", "Python", "Kafka", "Docker", "UPPAAL", "Industry 4.0", "Distributed Systems", "Software Architecture"], [])
projects.add_project("AgroNet", "github.com/STW-24-25", ["Plataforma web colaborativa para agricultores integrando precios de mercado en tiempo real, alertas meteorológicas personalizadas y visualización interactiva de datos geoespaciales", "Liderazgo en desarrollo del equipo front-end y despliegue en Vercel", "Gestión de comunicación backend alojada en AWS asegurando integración API confiable y sincronización de datos en tiempo real"], ["Astro", "NodeJs", "TypeScript", "MongoDB", "AWS", "Vercel"], ["Astro", "NodeJs", "TypeScript", "MongoDB", "AWS", "Vercel", "Web Development", "Full-Stack", "Agriculture Technology"], ["Metodologías: Agile, Scrum, ADD, Formal Verification", "Herramientas: Github Actions, Docker, Kubernetes"])
projects.add_project("Predicción del Precio de la Energía", "github.com/The-European-Avengers/BigDataProject", ["Análisis de conjuntos de datos meteorológicos del Instituto Meteorológico Danés y datos nacionales de consumo/precios energéticos para pronosticar precios eléctricos", "Aplicación de marcos big data y modelos de machine learning para procesar conjuntos de datos a gran escala para análisis predictivo cubriendo impacto renovable, períodos pico y patrones estacionales"], ["Kafka", "HDFS", "Kubernetes", "Hive", "Spark", "Python"], ["Kafka", "HDFS", "Kubernetes", "Hive", "Spark", "Python", "Big Data", "Machine Learning", "Energy Forecasting"], ["Herramientas: Github Actions, Docker, Kubernetes"])
skills = cv.add_skills("en")
skills.add_skill("Methodologies", ["Agile", "Scrum", "ADD", "Formal Verification"])
skills.add_skill("Tools", ["GitHub Actions", "Docker", "Kubernetes"])
skills = cv.add_skills("es")
skills.add_skill("Metodologías", ["Agile", "Scrum", "ADD", "Formal Verification"])
skills.add_skill("Herramientas", ["Github Actions", "Docker", "Kubernetes"])
cv.add_languages("en").add_languages(["English", "Spanish"])
cv.add_languages("es").add_languages(["Inglés", "Español"])
metrics = cv.add_metrics("en")
metrics.add_metric("Años de experiencia", 1)


customizer = Customization(cv)
    
# 1. El primer filtro define el lenguaje general del CV de forma única
customizer.add_filter("Profile", "LANGUAGE", "en")

# 2. Iteramos para incluir las secciones que se desean con los filtros definidos

customizer.add_filter("Education", "ALL", "None")

customizer.add_filter("Experience", "ALL", "None")

customizer.add_filter("Projects", "ALL", "None")

cv.build()
