package com.fatec.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping
    public String helloWorld() {
        return "Hello World!";
    }

    @GetMapping("/project")
    public String project() {
        return "Project Information: Java 17 | Spring Boot v3.1.4";
    }
}
