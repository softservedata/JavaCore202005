package com.softserve.edu7;

public class Appl {
	
	public <T> void myPrn(T temp) {
		System.out.println("temp = " + temp);
	}
	
	public static void main(String[] args) {
		/*-
		Box box = new Box();
		box.set(123);
		//
		// code
		box.set("123");
		// ....
		String s = (String) box.get();
		System.out.println("String s = " + s);
		//
		// Runtime Error
		int i = (int) box.get(); // Explicit (int). Code Smell
		System.out.println("int i = " + i);
		//
		BoxWrapper box = new BoxWrapper();
		box.set("123");
		String s = box.get();
		System.out.println("String s = " + s);
		//
		//int i = (int) box.get(); // Compile Error
		//System.out.println("int i = " + i);
		*/
		//
		BoxGen<String> box = new BoxGen<>();
		box.set("123");
		String s = box.get();
		System.out.println("String s = " + s);
		//
//		int i = (int) box.get(); // Compile Error
//		System.out.println("int i = " + i);
		//
		BoxGen<Integer> box2 = new BoxGen<>();
		box2.set(321);
		int i = box2.get();
		System.out.println("int i = " + i);
		//
		Appl appl = new Appl();
		appl.myPrn(s);
		appl.myPrn(i);
	}
}
