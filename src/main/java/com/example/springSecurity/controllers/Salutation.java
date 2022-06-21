package com.example.springSecurity.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Salutation {
    @GetMapping
    public String getSalutation() {
        return "Bonjour";
    }
}
