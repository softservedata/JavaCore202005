package com.softserve.edu6;

public class Circle extends Figure {
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
		System.out.println("public Circle(double radius)");
	}

	@Override
	public double getArea() {
		return (3.14 * (radius * radius));
	}
}
