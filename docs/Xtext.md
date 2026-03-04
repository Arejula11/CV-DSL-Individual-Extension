# Xtext Implementation Example

```
Metadata 
    style: "minimalist" 
    font: "Helvetica" 
    imgPath: "/assets/profile_pic.jpg"

Userdata 
    name: "Ana García" 
    email: "ana.garcia@email.com" 
    telephoneNumber: "+34 612 345 678" 
    direction: "Av. Principal 45" 
    city: "Barcelona" 
    country: "España"

Experience language: "es"
    title: "Desarrolladora Senior" 
    description: ["Liderazgo de equipo", "Desarrollo backend en Java"] 
    company: "Tech Solutions" 
    startDate: "2021-03-01" 
    endDate: "2023-12-31" 
    tags: ["Java", "Liderazgo", "Backend"]

    title: "Programadora Junior" 
    description: ["Mantenimiento de bases de datos", "Resolución de bugs"] 
    company: "DataCorp" 
    startDate: "2019-06-01" 
    endDate: "2021-02-28" 
    tags: ["SQL", "Mantenimiento"]

Projects language: "es"
    title: "Mi propio DSL"
    description: ["Un lenguaje de dominio específico para currículums"]
    technologies: ["Xtext", "Java", "Eclipse"]
    link: "https://github.com/anagarcia/resume-dsl"
    tags: ["DSL", "Compiladores"]

Education language: "es"
    title: "Grado en Ingeniería Informática" 
    institution: "Universitat Politècnica" 
    graduationDate: "2019-05-15" 
    country: "España" 
    tags: ["Universidad", "Informática"]

Skills language: "es"
    title: "Lenguajes de Programación" 
    tags: ["Java", "Python", "TypeScript"]
    
    title: "Herramientas"
    tags: ["Git", "Docker", "Eclipse"]

Languages language: "es"
    tags: ["Inglés", "Español", "Catalán"]

Customization include Profile where language "es"
include Education where endDate before "2021"

```