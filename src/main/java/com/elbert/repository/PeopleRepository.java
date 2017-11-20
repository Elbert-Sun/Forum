package com.elbert.repository;

import com.elbert.stubDatabase.Database;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class PeopleRepository {

    public ArrayList<String> findNames() {
        ArrayList<String> names = new ArrayList<String>();
        for (PeopleEntity person : Database.table)
            names.add(person.getName());
        return names;
    }

    public ArrayList<PeopleEntity> findAllPeople() {
        return Database.table;
    }

    public void save(PeopleEntity person) {
        Database.table.add(person);
    }
}
