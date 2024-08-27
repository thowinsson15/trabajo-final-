package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Clase principal de la aplicación Spring Boot.
 * Esta clase inicia la aplicación utilizando el método main.
 * 
 * Spring Boot se encargará automáticamente de escanear los componentes,
 * repositorios y entidades ubicados en los subpaquetes de 'com.example.demo'.
 */
@SpringBootApplication
public class DatabaseApplication {

    public static void main(String[] args) {
        // Inicia la aplicación Spring Boot
        SpringApplication.run(DatabaseApplication.class, args);
    }
}
