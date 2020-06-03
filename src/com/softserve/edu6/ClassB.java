package com.softserve.edu6;

public class ClassB extends ClassA {
	public double i = 1.1; // Overirde i - Invalid Solution

	public void m1() {
		System.out.println("ClassB, metod m1, i= " + i);
	}

	public void m4() {
		System.out.println("ClassB, metod m4");
	}
	
//	private void m5() { // Compile Error
//		System.out.println("ClassB, metod m5");
//	}
	
	@Override
	public void m6() {
		System.out.println("ClassB, metod m6");
	}
	
	//@Override // Architecture Error
	public void m7() {
		System.out.println("ClassB, metod m7");
	}
	
	public static void m8() {
		System.out.println("ClassB, static metod m8");
	}
}
