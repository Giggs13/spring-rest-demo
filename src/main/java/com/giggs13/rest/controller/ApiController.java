package com.giggs13.rest.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {

    @GetMapping(value = "/greet", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String greetUser() {
        return "Hi, User!";
    }
}
