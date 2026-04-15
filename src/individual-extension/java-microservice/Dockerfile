# Etapa 1: Construcción (Cambiado a Java 21)
FROM maven:3.9.6-eclipse-temurin-21 AS build
WORKDIR /app

# 1. Copiamos la carpeta libs primero
COPY libs ./libs

# 2. Instalamos el JAR local en el repositorio interno de Maven
RUN mvn install:install-file \
    -Dfile=libs/resume-dsl.jar \
    -DgroupId=com.dsl \
    -DartifactId=resume-dsl \
    -Dversion=1.0.0 \
    -Dpackaging=jar

# 3. Copiamos el pom y descargamos el resto de librerías
COPY pom.xml .
RUN mvn dependency:go-offline

# 4. Copiamos el código fuente y compilamos
COPY src ./src
RUN mvn clean package -DskipTests

# Etapa 2: Ejecución (Cambiado a Java 21)
FROM eclipse-temurin:21-jre-jammy
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]