package com.softserve.edu.hw7;

import com.sun.corba.se.impl.orbutil.CorbaResourceUtil;
import com.sun.org.apache.bcel.internal.generic.RETURN;

import java.util.*;

public class App {
    public List<String> buildlist(Set<String>animalSet,  Set<String>animalSet2){
        Set<String> newAnimalSet3 = new HashSet<String>(animalSet);
        newAnimalSet3.addAll(animalSet2);
        return new ArrayList<>(newAnimalSet3);
    };
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

        App app = new App();
        System.out.println(app.buildlist(animalSet,  animalSet2));

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

        Set<Integer> st1 = new HashSet<>(a);
        Set<Integer> st2 = new HashSet<>(b);
        if ((a.size() != b.size()) ||
                (b.size() != a.size())){
            System.out.println("not equal");
        } else {
            System.out.println("equal");
        }

    }
}

