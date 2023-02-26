package com.kodilla.collections.sets.homework;

import com.kodilla.collections.sets.Order;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args)
    {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Animals", "40x50", true));
        stamps.add(new Stamp("Landscapes", "43x36", false));
        stamps.add(new Stamp("Dogs", "45x17", false));
        stamps.add(new Stamp("Animals", "40x50", true));
        stamps.add(new Stamp("Animals", "40x50", true));
        stamps.add(new Stamp("Birds", "24x32", true));

        System.out.println(stamps.size());
        for (Stamp stamp : stamps)
            System.out.println(stamp);

    }
}
