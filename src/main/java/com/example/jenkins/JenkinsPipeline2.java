package com.example.jenkins;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class JenkinsPipeline2 {

    @GetMapping()
    public String welcome() {
        return "Hello everybody";
    }

    @GetMapping("goodbye")
    public String goodbye() {
        return "Goodbye everybody";
    }
}
