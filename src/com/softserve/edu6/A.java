package com.softserve.edu6;

public class A {
	private int i = 123;

	public A() {
		System.out.println("public A()");
	}

	public A(int i) {
		System.out.println("public A(int i)");
		this.i = i;
	}

	public int getI() {
		return i;
	}
	
	public void m1() {
		System.out.println("A m1()");
	}
}
