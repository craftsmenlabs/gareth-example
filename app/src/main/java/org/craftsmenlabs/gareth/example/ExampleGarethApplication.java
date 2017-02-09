package org.craftsmenlabs.gareth.example;


import org.craftsmenlabs.gareth.execution.GarethExecutionConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@ComponentScan(basePackages = "org.craftsmenlabs.gareth.example")
@Import(GarethExecutionConfig.class)
public class ExampleGarethApplication {
    public static void main(String[] args) {
        SpringApplication.run(ExampleGarethApplication.class, args);
    }
}
