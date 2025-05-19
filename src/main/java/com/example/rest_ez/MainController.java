package com.example.rest_ez;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    // http://localhost:8080/hello

    @GetMapping("/hello")
    public String hello() {
        return "Hello World!";
    }

}
