package com.codejava;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebServicesController {
    @GetMapping("/rest")
    public String sayRest(){
        return "Great, Let's take a rest with Spring Boot Application !";
    }
}
