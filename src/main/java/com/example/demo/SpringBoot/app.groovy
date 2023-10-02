package com.example.demo.SpringBoot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class ThisWillRun {

    @GetMapping("/")
    String home() {
        return "Hello, World!"
    }

}