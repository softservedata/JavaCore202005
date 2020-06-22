package com.softserve.edu13;

class MyException extends Exception {
	private static final long serialVersionUID = 1L;

	public MyException(String msg) {
		super(msg);
	}

	public MyException() {
	}
}

public class ApplStack {
	public static void method1() throws MyException {
		method2();
	}

	public static void method2() throws MyException {
		method3();
	}

	public static void method3() throws MyException {
		throw new MyException("Exception thrown in method3");
	}

	public static void main(String[] args) {
		try {
			method1();
		} catch (Exception e) {
			System.err.println(e.getMessage() + "\n");
			e.printStackTrace();
		}

	}
}
