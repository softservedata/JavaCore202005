package com.softserve.edu.hw7;

import java.util.*;

public class App {
    public static void main(String[] args) {
        Set<String> animalSet = new HashSet<String>();
        animalSet.add("Antilope");
        animalSet.add("Fox");
        animalSet.add("Goat");
        animalSet.add("Dog");
        animalSet.add("Elephant");
        animalSet.add("Bear");
        animalSet.add("Hippo");
        animalSet.add("Cat");
        animalSet.add("Chicken");
        animalSet.add("Caw");

        Set<String> animalSet2 = new HashSet<String>();
        animalSet2.add("test1");
        animalSet2.add("test2");
        animalSet2.add("test3");
        animalSet2.add("Fox");
        animalSet2.add("Goat");
        animalSet2.add("Dog");
        animalSet2.add("Elephant");
        animalSet2.add("Bear");
        animalSet2.add("Hippo");
        animalSet2.add("Cat");

        Set<String> newAnimalSet = new HashSet<String>(animalSet);
        newAnimalSet.retainAll(animalSet2);
        System.out.println(newAnimalSet);

        List<Integer> a = new ArrayList<>();
        a.add(9);
        a.add(7);
        a.add(5);
        a.add(3);

        List<Integer> b = new ArrayList<>();

        b.add(9);
        b.add(7);
        b.add(5);
        b.add(3);


        if (a.containsAll(b) && b.containsAll(a))
            System.out.println("Lists are equal");

    }
}

