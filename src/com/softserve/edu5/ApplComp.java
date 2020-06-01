package com.softserve.edu5;

public class ApplComp {
	public static void main(String[] args) {
		/*-
		String s1 = new String("123");
		String s2 = "123"; // new String("123");
		System.out.println("(s1 == s2) = " + (s1 == s2));
		System.out.println("s1.equals(s2) = " + s1.equals(s2));
		System.out.println("s1.hashCode() = " + s1.hashCode());
		System.out.println("s2.hashCode() = " + s2.hashCode());
		*/
		Student st1 = new Student("Ivan", 23);
		Student st2 = new Student("Ivan", 23);
		System.out.println("(st1 == st2) = " + (st1 == st2));
		System.out.println("st1.equals(st2) = " + st1.equals(st2));
		System.out.println("st1.hashCode() = " + st1.hashCode());
		System.out.println("st2.hashCode() = " + st2.hashCode());
		System.out.println("st1 = " + st1);
		System.out.println("st2 = " + st2);
		//
	}
}
