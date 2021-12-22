package com.htd.MyApp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleRestController {
    @Value("${myname}")
    private String name;

    @GetMapping("/greeting")
    public String greeting() {
        return name + " Welcome to Microservices";
    }
}