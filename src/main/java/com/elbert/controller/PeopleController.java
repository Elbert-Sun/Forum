package com.elbert.controller;

import com.elbert.repository.PeopleEntity;
import com.elbert.service.PeopleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PeopleController {
    Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    PeopleService peopleService;

    @RequestMapping(value="/", method=RequestMethod.GET)
    String index(Model model) {
        //This is necessary to have model.addAttribute in the this method. Check why
        model.addAttribute("person", new PeopleEntity());
        return "form";
    }

    @RequestMapping("/api/peopleNames")
    @ResponseBody
    String getAllPeople() {
        return "All Users:   " + peopleService.getAllNames();
    }

    @RequestMapping(value = "/addPerson", method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public String postPeople(@ModelAttribute PeopleEntity person, Model model) {

        model.addAttribute("person", person);
        peopleService.save(person);
        String info = String.format("Add new person  name = %s, password = %s",
                person.getName(), person.getPassword());
        log.info(info);

        return "result";
    }
}