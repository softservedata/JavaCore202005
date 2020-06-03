package com.softserve.edu6;

public class Rectangle extends Figure {
	private double length, width;

	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
		System.out.println("public Rectangle(double length, double width)");
	}

	@Override
	public double getArea() {
		return length * width;
	}
}
