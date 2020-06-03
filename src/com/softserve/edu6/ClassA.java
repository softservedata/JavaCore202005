package com.softserve.edu6;

public class ClassA {
	public int i = 1; // public Architecture Error

	public void m1() {
		System.out.println("ClassA, metod m1, i = " + i);
	}

	public void m2() {
		System.out.println("ClassA, metod m2, i = " + i);
	}

	public void m3() {
		System.out.print("ClassA, metod m3, runnind m4(): ");
		m4();
	}

	public void m4() {
		System.out.println("ClassA, metod m4");
	}
	
	public void m5() {
		System.out.println("ClassA, metod m5");
		m7();
	}
	
	protected void m6() {
		System.out.println("ClassA, metod m6");
	}
	
	private void m7() {
		System.out.println("ClassA, metod m7");
	}
	
	public static void m8() {
		System.out.println("ClassA, static metod m8");
	}
}
