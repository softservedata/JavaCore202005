package com.softserve.edu16;

import java.util.Arrays;
import java.util.Comparator;

class Person {
	private String name;
	private Integer age;

	public Person(String name, Integer age) {
		this.name = name;
		this.age = age;
	}

	public static int compareByName(Person a, Person b) {
		return a.name.compareTo(b.name);
	}

	public static int compareByAge(Person a, Person b) {
		return a.age.compareTo(b.age);
	}

	public String getName() {
		return name;
	}

	public Integer getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "[name=" + name + ", age=" + age + "]";
	}
}

public class Main {

	public static void main(String[] args) {
		Person[] persons = { new Person("Ivan", 34),
				new Person("Vasyl", 29),
				new Person("Olga", 26),
				new Person("Anna", 41) };
		System.out.println("Origin persons = " + Arrays.toString(persons));
		// 1
		Arrays.sort(persons, new Comparator<Person>() {
			public int compare(Person o1, Person o2) {
				return o1.getAge() - o2.getAge();
			}
		});
		System.out.println("Sorted by age persons = " + Arrays.toString(persons));
		//2
		Arrays.sort(persons, (p1, p2) -> Person.compareByName(p1, p2));
		System.out.println("Sorted by name persons = " + Arrays.toString(persons));
		System.out.println();

		// 3
		Arrays.sort(persons, Person::compareByAge);
		System.out.println("Sorted by age persons = " + Arrays.toString(persons));
	}
}
