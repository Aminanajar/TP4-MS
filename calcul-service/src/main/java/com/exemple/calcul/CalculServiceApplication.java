package com.exemple.calcul;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class CalculServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(CalculServiceApplication.class, args);
    }
}