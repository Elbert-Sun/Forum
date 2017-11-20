package com.elbert.controller;

import com.elbert.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorld {
    @Autowired
    PeopleService peopleService;

    @RequestMapping("/")
    String sayHello() {
        return "Hello World!!";
    }

    @RequestMapping("/api/peopleNames")
    String getAllPeople() {
        return "Hello " + peopleService.getAllNames();
    }
}