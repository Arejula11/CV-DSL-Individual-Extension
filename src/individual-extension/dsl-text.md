# Individual Extension

## DSL Example

```
Metadata 
    style: "Minimal" 
    font: "Calibri" 
    imgPath: "/assets/profile_pic_are.jpg"

Userdata 
    name: "Miguel Aréjula Aísa" 
    email: "arejula10@email.com" 
    linkedin: "linkedin.com/miguelarejula" 
    telephoneNumber: "+34 601491089"
    direction: "Østerbro" 
    city: "Odense" 
    country: "Denmark"


Education language: "en"

    title: "Master in Software Engineering"
    institution: "University of Southern Denmark"
    graduationDate: "June 2027"
    country: "Denmark"
    tags: ["Coursework: Advanced Software Engineering Methodologies, Advanced Software Architecture and Analysis Techniques, Big Data and Data Science Technology"]

    title: "BSc in Computer Science" 
    institution: "University of Zaragoza" 
    graduationDate: "June 2021" 
    country: "Spain" 
    tags: ["Coursework: Software Engineer, Distributed Systems, Software Architecture, Prerequisite Engineering, Verification and Validation, Agile Methodologies and Quality, and Artificial Intelligence.", "Achieved high honors in Information Systems II and Verification and Validation, demonstrating exceptional proficiency and understanding in these subjects."]

    title: "Cambridge English  Advance"
	institution: "Cambridge"
	graduationDate: "July 2024"
	country: "Spain"
    tags: [""]
    
Education language: "es"

    title: "Máster en Ingeniería de Software"
    institution: "Universidad de Southern Denmark"
    graduationDate: "Junio 2027"
    country: "Dinamarca"
    tags: ["Asignaturas: Advanced Software Engineering Methodologies, Advanced Software Architecture and Analysis Techniques, Big Data and Data Science Technology"]

    title: "Grado en Ingeniería Informática" 
    institution: "Universidad de Zaragoza" 
    graduationDate: "Junio 2021" 
    country: "España" 
    tags: ["Asignaturas: Software Engineer, Distributed Systems, Software Architecture, Prerequisite Engineering, Verification and Validation, Agile Methodologies and Quality, and Artificial Intelligence.", "Achieved high honors in Information Systems II and Verification and Validation, demonstrating exceptional proficiency and understanding in these subjects."]

    title: "Cambridge English  Advance"
    institution: "Cambridge"
    graduationDate: "July 2024"
    country: "España"
    tags: [""]
    

Experience language: "en"
    title: "Software Engineer"
    description: ["Led development of custom web application for Traumatology Department", "Developed full-stack system using React, PostgreSQL, Express, and FastAPI", "Integrated clinical data into relational model for clinical pathway validation"]
    company: "University of Zaragoza"
    startDate: "2024-06-01"
    endDate: "2025-08-31"
    tags: ["Backend", "Frontend", "React", "PostgreSQL", "FastAPI"]

    title: "Teaching Assistant"
    description: ["Support students in understanding core software architecture concepts by assisting with lab sessions, assignments, and problem-solving, while clearly explaining technical concepts and collaborating with professors."]
    company: "University of Southern Denmark"
    startDate: "2026-02-01"
    endDate: "2026-06-01"
    tags: ["Teaching", "Software Architecture", "Student Support"]

Projects language: "en"
    title: "Are-Dev"
    description: ["Personal technical blog and YouTube channel focused on software development, front-end technologies, and modern frameworks", "Published blog posts and videos sharing tutorials, project walk-throughs, and insights to engage the developer community"]
    technologies: ["Astro", "Vercel", "Markdown"]
    link: "are-dev.es"
    tags: ["Astro", "Vercel", "Markdown", "Blog", "YouTube"]

    title: "I4 Pizza Production System"
    description: ["Industry 4.0 pizza production system integrating warehouse, production line, and web platform via distributed architecture", "Designed, validated, and documented system architecture using ADD with requirements, use cases, microservice boundaries, and formal verification with UPPAAL", "Led system-level coordination, ensured architectural consistency, and supervised implementation"]
    technologies: ["Go", "Python", "Kafka", "Docker", "UPPAAL"]
    link: "github.com/The-European-Avengers/pizza-i4-architecture-group2"
    tags: ["Go", "Python", "Kafka", "Docker", "UPPAAL", "Industry 4.0", "Distributed Systems", "Software Architecture"]

    title: "AgroNet"
    description: ["Full-stack collaborative web platform for farmers integrating real-time market prices, personalized weather alerts, and interactive geospatial data visualization", "Led front-end team development and deployed on Vercel", "Managed backend communication hosted on AWS ensuring reliable API integration and real-time data synchronization"]
    technologies: ["Astro", "NodeJs", "TypeScript", "MongoDB", "AWS", "Vercel"]
    link: "github.com/STW-24-25"
    tags: ["Astro", "NodeJs", "TypeScript", "MongoDB", "AWS", "Vercel", "Web Development", "Full-Stack", "Agriculture Technology"]
    from: sk1,sk2

    title: "Energy Price Prediction"
    description: ["Analyzed Danish Meteorological Institute weather datasets and national energy consumption/price data to forecast electricity prices", "Applied big data frameworks and machine learning models to process large-scale datasets for predictive analytics covering renewable energy impact, peak price periods, and seasonal patterns"]
    technologies: ["Kafka", "HDFS", "Kubernetes", "Hive", "Spark", "Python"]
    link: "github.com/The-European-Avengers/BigDataProject"
    tags: ["Kafka", "HDFS", "Kubernetes", "Hive", "Spark", "Python", "Big Data", "Machine Learning", "Energy Forecasting"]
    from: sk2

Projects language: "es"
    title: "Are-Dev"
    description: ["Blog técnico personal y canal de YouTube centrado en desarrollo de software, tecnologías front-end y frameworks modernos", "Publicación de artículos y videos compartiendo tutoriales, walkthroughs de proyectos e insights para la comunidad de desarrolladores"]
    technologies: ["Astro", "Vercel", "Markdown"]
    link: "are-dev.es"
    tags: ["Astro", "Vercel", "Markdown", "Blog", "YouTube"]

    title: "Sistema de Producción de Pizza I4"
    description: ["Sistema de producción de pizza Industria 4.0 integrando almacén, línea de producción y plataforma web mediante arquitectura distribuida", "Diseño, validación y documentación de la arquitectura del sistema utilizando ADD con requisitos, casos de uso, límites de microservicios y verificación formal con UPPAAL", "Liderazgo en coordinación a nivel sistema, asegurando consistencia arquitectónica y supervisión de implementación"]
    technologies: ["Go", "Python", "Kafka", "Docker", "UPPAAL"]
    link: "github.com/The-European-Avengers/pizza-i4-architecture-group2"
    tags: ["Go", "Python", "Kafka", "Docker", "UPPAAL", "Industry 4.0", "Distributed Systems", "Software Architecture"]

    title: "AgroNet"
    description: ["Plataforma web colaborativa para agricultores integrando precios de mercado en tiempo real, alertas meteorológicas personalizadas y visualización interactiva de datos geoespaciales", "Liderazgo en desarrollo del equipo front-end y despliegue en Vercel", "Gestión de comunicación backend alojada en AWS asegurando integración API confiable y sincronización de datos en tiempo real"]
    technologies: ["Astro", "NodeJs", "TypeScript", "MongoDB", "AWS", "Vercel"]
    link: "github.com/STW-24-25"
    tags: ["Astro", "NodeJs", "TypeScript", "MongoDB", "AWS", "Vercel", "Web Development", "Full-Stack", "Agriculture Technology"]
    from: sk3,sk4

    title: "Predicción del Precio de la Energía"
    description: ["Análisis de conjuntos de datos meteorológicos del Instituto Meteorológico Danés y datos nacionales de consumo/precios energéticos para pronosticar precios eléctricos", "Aplicación de marcos big data y modelos de machine learning para procesar conjuntos de datos a gran escala para análisis predictivo cubriendo impacto renovable, períodos pico y patrones estacionales"]
    technologies: ["Kafka", "HDFS", "Kubernetes", "Hive", "Spark", "Python"]
    link: "github.com/The-European-Avengers/BigDataProject"
    tags: ["Kafka", "HDFS", "Kubernetes", "Hive", "Spark", "Python", "Big Data", "Machine Learning", "Energy Forecasting"]
    from: sk4


Skills language: "en"
    sk1 title: "Methodologies" 
    tags: ["Agile", "Scrum", "ADD", "Formal Verification"]
    
    sk2 title: "Tools"
    tags: ["GitHub Actions", "Docker", "Kubernetes"]

Skills language: "es"
    sk3 title: "Metodologías"
    tags: ["Agile", "Scrum", "ADD", "Formal Verification"]
    
    sk4 title: "Herramientas"
    tags:["Github Actions", "Docker", "Kubernetes"]

Languages language: "en"
    tags: ["English", "Spanish"]
    
Languages language: "es"
    tags: ["Inglés", "Español"]


Metrics language: "en"
	Metric "Años de experiencia" = 2025 - 2024

Customization 
include Profile where language "en"
include Education where all
include Experience where all
include Projects where all
```

## Postam Request example
```json
{
  "dsl": "Metadata \n    style: \"Minimal\" \n    font: \"Calibri\" \n    imgPath: \"/assets/profile_pic_are.jpg\"\n\nUserdata \n    name: \"Miguel Aréjula Aísa\" \n    email: \"arejula10@email.com\" \n    linkedin: \"linkedin.com/miguelarejula\" \n    telephoneNumber: \"+34 601491089\"\n    direction: \"Østerbro\" \n    city: \"Odense\" \n    country: \"Denmark\"\n\n\nEducation language: \"en\"\n\n    title: \"Master in Software Engineering\"\n    institution: \"University of Southern Denmark\"\n    graduationDate: \"June 2027\"\n    country: \"Denmark\"\n    tags: [\"Coursework: Advanced Software Engineering Methodologies, Advanced Software Architecture and Analysis Techniques, Big Data and Data Science Technology\"]\n\n    title: \"BSc in Computer Science\" \n    institution: \"University of Zaragoza\" \n    graduationDate: \"June 2021\" \n    country: \"Spain\" \n    tags: [\"Coursework: Software Engineer, Distributed Systems, Software Architecture, Prerequisite Engineering, Verification and Validation, Agile Methodologies and Quality, and Artificial Intelligence.\", \"Achieved high honors in Information Systems II and Verification and Validation, demonstrating exceptional proficiency and understanding in these subjects.\"]\n\n    title: \"Cambridge English  Advance\"\n    institution: \"Cambridge\"\n    graduationDate: \"July 2024\"\n    country: \"Spain\"\n    tags: [\"\"]\n    \nEducation language: \"es\"\n\n    title: \"Máster en Ingeniería de Software\"\n    institution: \"Universidad de Southern Denmark\"\n    graduationDate: \"Junio 2027\"\n    country: \"Dinamarca\"\n    tags: [\"Asignaturas: Advanced Software Engineering Methodologies, Advanced Software Architecture and Analysis Techniques, Big Data and Data Science Technology\"]\n\n    title: \"Grado en Ingeniería Informática\" \n    institution: \"Universidad de Zaragoza\" \n    graduationDate: \"Junio 2021\" \n    country: \"España\" \n    tags: [\"Asignaturas: Software Engineer, Distributed Systems, Software Architecture, Prerequisite Engineering, Verification and Validation, Agile Methodologies and Quality, and Artificial Intelligence.\", \"Achieved high honors in Information Systems II and Verification and Validation, demonstrating exceptional proficiency and understanding in these subjects.\"]\n\n    title: \"Cambridge English  Advance\"\n    institution: \"Cambridge\"\n    graduationDate: \"July 2024\"\n    country: \"España\"\n    tags: [\"\"]\n    \n\nExperience language: \"en\"\n    title: \"Software Engineer\"\n    description: [\"Led development of custom web application for Traumatology Department\", \"Developed full-stack system using React, PostgreSQL, Express, and FastAPI\", \"Integrated clinical data into relational model for clinical pathway validation\"]\n    company: \"University of Zaragoza\"\n    startDate: \"2024-06-01\"\n    endDate: \"2025-08-31\"\n    tags: [\"Backend\", \"Frontend\", \"React\", \"PostgreSQL\", \"FastAPI\"]\n\n    title: \"Teaching Assistant\"\n    description: [\"Support students in understanding core software architecture concepts by assisting with lab sessions, assignments, and problem-solving, while clearly explaining technical concepts and collaborating with professors.\"]\n    company: \"University of Southern Denmark\"\n    startDate: \"2026-02-01\"\n    endDate: \"2026-06-01\"\n    tags: [\"Teaching\", \"Software Architecture\", \"Student Support\"]\n\nProjects language: \"en\"\n    title: \"Are-Dev\"\n    description: [\"Personal technical blog and YouTube channel focused on software development, front-end technologies, and modern frameworks\", \"Published blog posts and videos sharing tutorials, project walk-throughs, and insights to engage the developer community\"]\n    technologies: [\"Astro\", \"Vercel\", \"Markdown\"]\n    link: \"are-dev.es\"\n    tags: [\"Astro\", \"Vercel\", \"Markdown\", \"Blog\", \"YouTube\"]\n\n    title: \"I4 Pizza Production System\"\n    description: [\"Industry 4.0 pizza production system integrating warehouse, production line, and web platform via distributed architecture\", \"Designed, validated, and documented system architecture using ADD with requirements, use cases, microservice boundaries, and formal verification with UPPAAL\", \"Led system-level coordination, ensured architectural consistency, and supervised implementation\"]\n    technologies: [\"Go\", \"Python\", \"Kafka\", \"Docker\", \"UPPAAL\"]\n    link: \"github.com/The-European-Avengers/pizza-i4-architecture-group2\"\n    tags: [\"Go\", \"Python\", \"Kafka\", \"Docker\", \"UPPAAL\", \"Industry 4.0\", \"Distributed Systems\", \"Software Architecture\"]\n\n    title: \"AgroNet\"\n    description: [\"Full-stack collaborative web platform for farmers integrating real-time market prices, personalized weather alerts, and interactive geospatial data visualization\", \"Led front-end team development and deployed on Vercel\", \"Managed backend communication hosted on AWS ensuring reliable API integration and real-time data synchronization\"]\n    technologies: [\"Astro\", \"NodeJs\", \"TypeScript\", \"MongoDB\", \"AWS\", \"Vercel\"]\n    link: \"github.com/STW-24-25\"\n    tags: [\"Astro\", \"NodeJs\", \"TypeScript\", \"MongoDB\", \"AWS\", \"Vercel\", \"Web Development\", \"Full-Stack\", \"Agriculture Technology\"]\n    from: sk1,sk2\n\n    title: \"Energy Price Prediction\"\n    description: [\"Analyzed Danish Meteorological Institute weather datasets and national energy consumption/price data to forecast electricity prices\", \"Applied big data frameworks and machine learning models to process large-scale datasets for predictive analytics covering renewable energy impact, peak price periods, and seasonal patterns\"]\n    technologies: [\"Kafka\", \"HDFS\", \"Kubernetes\", \"Hive\", \"Spark\", \"Python\"]\n    link: \"github.com/The-European-Avengers/BigDataProject\"\n    tags: [\"Kafka\", \"HDFS\", \"Kubernetes\", \"Hive\", \"Spark\", \"Python\", \"Big Data\", \"Machine Learning\", \"Energy Forecasting\"]\n    from: sk2\n\nProjects language: \"es\"\n    title: \"Are-Dev\"\n    description: [\"Blog técnico personal y canal de YouTube centrado en desarrollo de software, tecnologías front-end y frameworks modernos\", \"Publicación de artículos y videos compartiendo tutoriales, walkthroughs de proyectos e insights para la comunidad de desarrolladores\"]\n    technologies: [\"Astro\", \"Vercel\", \"Markdown\"]\n    link: \"are-dev.es\"\n    tags: [\"Astro\", \"Vercel\", \"Markdown\", \"Blog\", \"YouTube\"]\n\n    title: \"Sistema de Producción de Pizza I4\"\n    description: [\"Sistema de producción de pizza Industria 4.0 integrando almacén, línea de producción y plataforma web mediante arquitectura distribuida\", \"Diseño, validación y documentación de la arquitectura del sistema utilizando ADD con requisitos, casos de uso, límites de microservicios y verificación formal con UPPAAL\", \"Liderazgo en coordinación a nivel sistema, asegurando consistencia arquitectónica y supervisión de implementación\"]\n    technologies: [\"Go\", \"Python\", \"Kafka\", \"Docker\", \"UPPAAL\"]\n    link: \"github.com/The-European-Avengers/pizza-i4-architecture-group2\"\n    tags: [\"Go\", \"Python\", \"Kafka\", \"Docker\", \"UPPAAL\", \"Industry 4.0\", \"Distributed Systems\", \"Software Architecture\"]\n\n    title: \"AgroNet\"\n    description: [\"Plataforma web colaborativa para agricultores integrando precios de mercado en tiempo real, alertas meteorológicas personalizadas y visualización interactiva de datos geoespaciales\", \"Liderazgo en desarrollo del equipo front-end y despliegue en Vercel\", \"Gestión de comunicación backend alojada en AWS asegurando integración API confiable y sincronización de datos en tiempo real\"]\n    technologies: [\"Astro\", \"NodeJs\", \"TypeScript\", \"MongoDB\", \"AWS\", \"Vercel\"]\n    link: \"github.com/STW-24-25\"\n    tags: [\"Astro\", \"NodeJs\", \"TypeScript\", \"MongoDB\", \"AWS\", \"Vercel\", \"Web Development\", \"Full-Stack\", \"Agriculture Technology\"]\n    from: sk3,sk4\n\n    title: \"Predicción del Precio de la Energía\"\n    description: [\"Análisis de conjuntos de datos meteorológicos del Instituto Meteorológico Danés y datos nacionales de consumo/precios energéticos para pronosticar precios eléctricos\", \"Aplicación de marcos big data y modelos de machine learning para procesar conjuntos de datos a gran escala para análisis predictivo cubriendo impacto renovable, períodos pico y patrones estacionales\"]\n    technologies: [\"Kafka\", \"HDFS\", \"Kubernetes\", \"Hive\", \"Spark\", \"Python\"]\n    link: \"github.com/The-European-Avengers/BigDataProject\"\n    tags: [\"Kafka\", \"HDFS\", \"Kubernetes\", \"Hive\", \"Spark\", \"Python\", \"Big Data\", \"Machine Learning\", \"Energy Forecasting\"]\n    from: sk4\n\n\nSkills language: \"en\"\n    sk1 title: \"Methodologies\" \n    tags: [\"Agile\", \"Scrum\", \"ADD\", \"Formal Verification\"]\n    \n    sk2 title: \"Tools\"\n    tags: [\"GitHub Actions\", \"Docker\", \"Kubernetes\"]\n\nSkills language: \"es\"\n    sk3 title: \"Metodologías\"\n    tags: [\"Agile\", \"Scrum\", \"ADD\", \"Formal Verification\"]\n    \n    sk4 title: \"Herramientas\"\n    tags:[\"Github Actions\", \"Docker\", \"Kubernetes\"]\n\nLanguages language: \"en\"\n    tags: [\"English\", \"Spanish\"]\n    \nLanguages language: \"es\"\n    tags: [\"Inglés\", \"Español\"]\n\n\nMetrics language: \"en\"\n    Metric \"Años de experiencia\" = 2025 - 2024\n\nCustomization \ninclude Profile where language \"en\"\ninclude Education where all\ninclude Experience where all\ninclude Projects where all"
}
```

