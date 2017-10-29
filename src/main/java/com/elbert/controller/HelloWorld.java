package com.elbert.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorld {

    @RequestMapping("/")
    String sayHello() {
        return "Hello World!!";
    }
}