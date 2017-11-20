package com.elbert.service;

import com.elbert.repository.PeopleEntity;
import com.elbert.repository.PeopleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PeopleService {
    @Autowired
    PeopleRepository peopleRepository;

    public ArrayList<String> getAllNames() {
        return peopleRepository.findNames();
    }

    public ArrayList<PeopleEntity> getAllPeople() {
        return peopleRepository.findAllPeople();
    }

    public void save(PeopleEntity person) {
        peopleRepository.save(person);
    }
}
