package com.co.glamping.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class DemoController {

    @PostMapping("/demo")
    public String welcome()
    {
        return "Welcome from secure endpoint";
    }

    @GetMapping("/hello")
    public String sayHello() {
        return "¡Hola, mundo!";
    }
}