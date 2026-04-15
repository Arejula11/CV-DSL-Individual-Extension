package com.dsl.java_microservice;

import com.google.inject.Injector;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

// IMPORTANTE: Tu paquete de Xtext
import org.xtext.example.resume.ResumeStandaloneSetup;

@SpringBootApplication
public class JavaMicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaMicroserviceApplication.class, args);
    }

    // Al crear esto como un @Bean, Spring Boot lo ejecuta al arrancar
    // y guarda el "Injector" (el motor de Xtext) en memoria para que lo usemos luego.
    @Bean
    public Injector xtextInjector() {
        System.out.println("=========================================");
        System.out.println("Inicializando motor Xtext como Spring Bean...");
        Injector injector = new ResumeStandaloneSetup().createInjectorAndDoEMFRegistration();
        System.out.println("¡Motor Xtext listo y disponible!");
        System.out.println("=========================================");
        return injector;
    }
}