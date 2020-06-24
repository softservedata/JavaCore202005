package com.softserve.edu15;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

class Person {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}
}

public class AppFunction {
	public static void main(String[] args) {
		/*-
		// Predicate<String> predicate = (s) -> s.length() > 3;
		// System.out.println("res = " + predicate.test("abc"));
		//
		//List<String> names = Arrays.asList(new String[] { "Angela", "Aaron", "Bob", "Claire", "David" });
		List<String> names = Arrays.asList("Angela", "Aaron", "Bob", "Claire", "A", "David", "Aa");
		//
		System.out.println("Original: " + names);
		List<String> namesWithA = names.stream()
				.filter(s -> s.length() > 2)
				.filter(name -> name.startsWith("A"))
				.collect(Collectors.toList());
		System.out.println("Updated: " + namesWithA);
		/
		Function<String, Integer> stringToInt = x -> Integer.valueOf(x);
		System.out.println("2+'3' = " + (stringToInt.apply("3") + 2));
		//
		List<String> names = Arrays.asList("John", "Freddy", "Samuel");
		// for (String current : names) {
		// System.out.println("Hello, " + current);
		// }
		names.forEach(name -> System.out.println("Hello, " + name));
		//
		Supplier<Person> personSupplier = Person::new;
		Person person = personSupplier.get();
		person.setName("Ivan");
		System.out.println("person = " + person.getName());
		//
		List<String> names = Arrays.asList("bob", "josh", "megan");
		System.out.println("Original: " + names);
		//
		List<String> next = new ArrayList<>();
		for (String current : names) {
			next.add(current.toUpperCase());
		}
		//System.out.println("next: " + next);
		//names.clear(); // Runtime Error
		names = next;
		System.out.println("next: " + names);
		*/
		List<String> names = Arrays.asList("bob", "josh", "megan");
		System.out.println("Original: " + names);
		//
//		Iterator<String> iter = names.iterator();
//		while (iter.hasNext()) {
//			String current = iter.next();
//			current= current.toUpperCase();
//			System.out.print(current + "  ");
//		}
		//
//		ListIterator<String> iter = names.listIterator();
//		while (iter.hasNext()) {
//			String current = iter.next();
//			current = current.toUpperCase();
//			iter.set(current);
//		}
		names.replaceAll(current -> current.toUpperCase());
		System.out.println("Updated: " + names);
		//BinaryOperator<String> b;
		//
	}
}
