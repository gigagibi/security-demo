package com.example.securitydemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewController {
    @GetMapping("/get")
    public String get() {
        return "HELLO WORLD";
    }
}
