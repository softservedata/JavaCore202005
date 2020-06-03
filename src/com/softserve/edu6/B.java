package com.softserve.edu6;

public class B extends A {
	public int j;

	public B() {
		super(21);
		//super();
		System.out.println("public B()");
	}

	@Override
	public void m1() {
		System.out.println("B m1()");
		super.m1();
	}
}
