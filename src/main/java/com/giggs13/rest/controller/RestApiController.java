package com.giggs13.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RestApiController {

    @GetMapping("/greet")
    public String greetUser() {
        return "Hi, User!";
    }
}
