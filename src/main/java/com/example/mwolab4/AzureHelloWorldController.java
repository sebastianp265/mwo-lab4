package com.example.mwolab4;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/hello-world")
public class AzureHelloWorldController {

    @GetMapping
    public String helloWorld() {
        return "Hello World!";
    }

}
