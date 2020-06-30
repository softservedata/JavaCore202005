package com.softserve.edu16;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Person2 {
    public String name;

    public Person2(String name) {
        this.name = name;
    }

    public String getName() {
		return name;
	}

	public void addName(String second) {
		this.name = name + second;
	}

	@Override
    public String toString() {
        return name;
    }
}

public class Sample {
	
    public static void main(String[] args) {
        List<Person2> list = new ArrayList<>();
        list.add(new Person2("John"));
        list.add(new Person2("Bill"));
        list.add(new Person2("Peter"));
        list.add(new Person2("John"));
        /*-
        List<Person2> list1 = new ArrayList<>();
        Stream<Person2> stream = list.stream();
        stream.filter(x -> (x.name.equals("John")))
                .map(x -> x.name + " Dou")
                .forEach(x -> list1.add(new Person2(x)));
        System.out.println(list1);
        */
        //List<Person2> list1 =
        list =
        		list.stream()
        		.filter(x -> (x.name.equals("John")))
        		//.sorted((x, y) -> x.name.compareTo(y.name))
        		.peek(x -> x.addName(" Dou"))
        		//.forEach(System.out::println);
        		.collect(Collectors.toList());
        System.out.println("new " + list);
    }
}
