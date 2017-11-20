package com.elbert.stubDatabase;

import com.elbert.repository.PeopleEntity;

import java.util.ArrayList;

public class Database {
    public static ArrayList<PeopleEntity> table;

    static {
        PeopleEntity Elbert = new PeopleEntity("Elbert", "123");
        PeopleEntity Erica = new PeopleEntity("Erica", "000");

    }
}
