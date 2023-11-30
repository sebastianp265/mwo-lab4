package com.example.mwolab4;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AzureHelloWorldController {
    @GetMapping("/helloworld")
    public String helloWorld() {
        return "Hello, World!";
    }
}
