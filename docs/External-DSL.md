# External DSL

In this document, we explain the process of creating an external DSL.

## Example of Our External DSL Syntax
```
Metadata
	style: "Academic"
	font: "Times New Roman"
	imgPath: "~/Documents/Images/ProfilePicture.jpg"
	
Userdata
	name: "Lucas Gonzalez"
	email: "lucasgonz@gmail.com"
	telephoneNumber: "+45 600000000"
    direction: "Some Street 123"
    city: "Odense"
    country: "Denmark"
	
Experience
	language: "EN"
	title: "Software Engineer"
		description: ["Implemented an internal tool for analyitics"]
		company: "Google"
		startDate: 02-2020
		endDate: 01-2022
		tags: ["CLOUD", "JAVA", "DEVELOPER"]
    title: "Software Engineer2"
		description: ["Implemented an website for a restaurant"]
		company: "McDonald's"
		startDate: 02-2022
		endDate: 01-2023
		tags: ["WEB", "JAVASCRIPT", "DEVELOPER"]
	
Experience
	language: "ES"
	title: "Ingeniero de Software"
		description: ["Implementé una herramienta interna para análisis"]
		company: "Google"
		startDate: 02-2020
		endDate: 01-2022
		tags: ["CLOUD", "JAVA", "DESARROLLADOR"]
    title: "Ingeniero de Software2"
        description: ["Implementé un sitio web para un restaurante"]
        company: "McDonald's"
        startDate: 02-2022
        endDate: 01-2023
        tags: ["WEB", "JAVASCRIPT", "DESARROLLADOR"]
	
Projects
	language: "EN"
	title: "REST API"
		description: ["Implemented a REST API for a shooping e-commerce", "Collaborate with experts"]
		technologies: ["Node.js", "Express"]
		link: "https://link.com"
		tags: ["WEB", "BACKEND"]
	title: "Pizza Web"
		description: ["Implemented a UI for a pizza restaurant", "Collaborate with experts"]
		technologies: ["Next.js", "React"]
		link: "https://link2.com"
		tags: ["WEB", "FRONTEND"]
Education
	language: "EN"
	title: "Master in Software Engineering"
        institution: "SDU"
        graduationDate: 2018
        country: "Denmark"
        tags: ["MASTER", "UNIVERSITY"]

Skills
	language: "EN"
	title: Frontend
		tags: ["React", "HTML", "CSS", "Next.js"]
	title: Backend
		tags: ["Node.js", "Python", "FastAPI", "Express.js"]
Interests
	language: "EN"
	tags: ["Football", "Running", "Videogames", "Dancing"]
Languages
	language: "EN"
	tags: ["English", "Spanish", "Italian"]
	
Customization
	include Profile where language EN
	include Education where tags include UNIVERSITY
	include Projects where tags include WEB
    include Experience where startDate after 01-01-2021
	
```	

## Syntax as an EBNF Grammar

```
Profile ::= "Metadata" Metadata "Userdata" Userdata Sections
Metadata ::= "style:" String "font:" String "imgPath:" String
Userdata ::= "name:" String "email:" String "telephoneNumber:" String "direction:" String "city:" String "country:" String
Sections ::= (Experience | Projects | Education | Skills | Interests | Languages)+
Experience ::= "Experience" "language:" String ("title:" String "description:" "[" String ("," String)* "]" "company:" String "startDate:" Date "endDate:" Date "tags:" "[" String ("," String)* "]")+
Projects ::= "Projects" "language:" String ("title:" String "description:" "[" String ("," String)* "]" "technologies:" "[" String ("," String)* "]" "link:" String "tags:" "[" String ("," String)* "]")+
Education ::= "Education" "language:" String ("title:" String "institution:" String "graduationDate:" Date "country:" String "tags:" "[" String ("," String)* "]")+
Skills ::= "Skills" "language:" String ("title:" String "tags:" "[" String ("," String)* "]")+
Interests ::= "Interests" "language:" String "tags:" "[" String ("," String)* "]"
Languages ::= "Languages" "language:" String "tags:" "[" String ("," String)* "]"
Customization ::= "Customization" CustomizationRules
CustomizationRules ::= "include Profile where language" String ("include" SectionType "where" Filter)+
SectionType ::= "Experience" | "Projects" | "Education" | "Skills" | "Interests" | "Languages"
Filter ::=  "tags include" String | "startDate after" Date | "endDate before" Date
Date ::= String
String ::= '"' [^"]* '"'
```

