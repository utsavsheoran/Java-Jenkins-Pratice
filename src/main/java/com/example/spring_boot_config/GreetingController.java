package com.example.spring_boot_config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @Value("${my.greeting}")
    private String greeting;

    @GetMapping("/greeting")
    public String getGreeting(){
        return greeting;
    }
}
