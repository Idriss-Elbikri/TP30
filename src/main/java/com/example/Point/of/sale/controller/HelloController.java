package com.example.Point.of.sale.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/")
public class HelloController {
    @GetMapping
    public String hello(){
        return "Hello";
    }

    @GetMapping("/presentation")
    public String getPresentation(){
        return "pres";
    }

    @GetMapping("/user")
    public String getUsers(){
        return "User";
    }
}
