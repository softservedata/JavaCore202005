package com.softserve.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Sample {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("John"));
        list.add(new Person("Bill"));
        list.add(new Person("Peter"));
        list.add(new Person("John"));

        List<Person> list1 = new ArrayList<>();

        Stream<Person> stream = list.stream();
        stream.filter(x -> (x.name.equals("John")))
                .map(x -> x.name + " Dou")
                .forEach(x -> list1.add(new Person(x)));

        System.out.println(list1);
    }
}

class Person {
    public String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

}
