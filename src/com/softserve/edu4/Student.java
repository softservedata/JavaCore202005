package com.softserve.edu4;

public class Student {
	private String name;
	private double rating;
	private static double avgRating; // = 0.0;
	private static int count; // = 0;
	
	static {
		avgRating = 0.0;
		count = 0;
		System.out.println("static block done");
	}

	public Student(String name, double rating) {
		this.name = name;
		this.rating = rating;
		avgRating = avgRating + rating;
		count++;
		System.out.println("constuctor done, name = " + name);
	}

	public Student() {
		name = "";
		rating = 0.0;
		avgRating = avgRating + rating;
		count++;
	}

	public static double getAvgRating() {
		return avgRating / count;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Student [name=" + name
				+ ", rating=" + rating + "]";
	}
	
}
