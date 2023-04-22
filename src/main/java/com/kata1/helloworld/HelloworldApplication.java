package com.kata1.helloworld;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Hello API", version = "1.0"))
public class HelloworldApplication {

    public static void main(String[] args) {
        SpringApplication.run (HelloworldApplication.class, args);
    }

}
