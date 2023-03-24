package com.restpai.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping(value = "/hello")
    public String Hello(){
        return "hello hello hello!";
    }
}
