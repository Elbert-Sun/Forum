package com.elbert.stubDatabase;

import com.elbert.repository.PeopleEntity;
import sun.jvm.hotspot.debugger.posix.elf.ELFException;

import java.util.ArrayList;

public class Database {
    public static ArrayList<PeopleEntity> table = new ArrayList<PeopleEntity>();

    static {
        PeopleEntity Elbert = new PeopleEntity("Elbert", "123");
        PeopleEntity Erica = new PeopleEntity("Erica", "000");
        table.add(Elbert);
        table.add(Erica);
    }
}
