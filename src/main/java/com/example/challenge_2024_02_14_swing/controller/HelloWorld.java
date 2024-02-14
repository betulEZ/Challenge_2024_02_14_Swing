package com.example.challenge_2024_02_14_swing.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hello")
public class HelloWorld {

     @GetMapping
    public String hello(){
         return "Hello World";
     }
}
