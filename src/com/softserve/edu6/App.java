package com.softserve.edu6;

public class App {
	public static void main(String[] args) {
		/*-
		B b = new B();
		//A b = new A();
		System.out.println("i = " + b.getI());
		b.m1();
		//
		// Figure figure = new Figure(); // Error
		// Figure figure = new Circle(1);
		Figure[] figures = { new Circle(1), new Rectangle(1, 2), new Circle(2), new Rectangle(2, 2) };
		for (Figure current : figures) {
			System.out.println("current name = " + current.getClass().getName()
					+ " \tcurrent.getArea() = " + current.getArea());
		}
		//
		//Square square = new Square();
		Formula square = new Square();
		System.out.println("square.calculate(2) = " + square.calculate(2));
		//
		Formula formula = new Formula() {
			@Override
			public double calculate(int a) {
				return sqr(a + 1);
			}
		};
		System.out.println("square.calculate(2) = " + formula.calculate(2));
		//
		int num = 11;
		double data = 2.5;
		//data = num;  // Valid
		//System.out.println("data = " + data);
		num = (int) data;  // explicit
		System.out.println("num = " + num);
		//
		A a = new B();
		B b;
		if (a instanceof B) {
			System.out.println("Use a");
			b = (B) a;
		} else {
			System.out.println("Create new Object");
			b = new B();
		}
		b.m1();
		*/
		System.out.println("The Start.");
		//
//		ClassA a = new ClassA();
//		System.out.println("Test ClassA.");
//		a.m1();
//		a.m2();
//		a.m3();
//		a.m4();
		//
		ClassB b = new ClassB();
		System.out.println("Test ClassB.");
		System.out.println("b.i = " + b.i);
		b.m1();
		b.m2();
		b.m3();
		b.m4();
		b.m5();
		b.m6();
		b.m7();
		//b.m8(); // Invalid Solution
		ClassB.m8();
		//
//		ClassA b0 = new ClassB();
//		System.out.println("Test_0 ClassB.");
//		System.out.println("b0.i = " + b0.i); // Architecture Error
//		b0.m1();
//		b0.m2();
//		b0.m3();
//		b0.m4();
//		b0.m5();
		//b0.m6();
		//b0.m7();
		//b0.m8();
		//
	}
}
