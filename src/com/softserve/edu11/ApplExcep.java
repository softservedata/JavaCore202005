package com.softserve.edu11;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

class Base {
	public void doSomething() throws IOException {
	}
}

class Child extends Base {
	@Override
	public void doSomething() throws FileNotFoundException {
	}
}

class MyException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public MyException() {
		super();
	}

	public MyException(String message) {
		super(message);
	}

	// methods
}

public class ApplExcep {

	public int mySomthing() {
		int k = 0;
		System.out.print("k = ");
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			k = Integer.parseInt(br.readLine());
		} catch (Exception e) {
			// Logging. Fixing.
			System.out.println("Exception Found");
			throw new MyException("User message Error");
		}
		return k;
	}

	// public int doSomthing(int n) throws IllegalArgumentException { // Optional
	public int doSomthing(int n) {
		if (n < 0) {
			throw new IllegalArgumentException("Invalid Parameter");
		}
		int result = 0;
		try {
			// If n = 0, then causes ArithmeticException
			result = 100 / n;
			// return 100 / n;
		} catch (ArithmeticException e) {
			// catch exception by class name
			System.out.println("Division by zero");
			// return 0;
		} finally {
			System.out.println("finally");
		}
		return result;
	}

	// public static void main(String[] args) throws NumberFormatException,
	// IOException { // Invalid Solution
	public static void main(String[] args) {
		ApplExcep app = new ApplExcep();
//		System.out.println("app.doSomthing(0) = " + app.doSomthing(10));
		try {
			System.out.println("mySomthing k = " + app.mySomthing());
		} catch (MyException e) {
			System.out.println("Found: " + e.getMessage());
		}
		//
		/*-
		int i = 0;
		try {
			//
			//try {
			//	System.out.println("res = " + 10 / i);
			//} catch (NumberFormatException e) { 
			//	System.out.println("Number Format Exception");
			//}
			//
			System.out.println("res = " + 10 / i);
			// System.exit(0);
		} catch (NullPointerException e) { // ArithmeticException
			System.out.println("Oh, error found");
		} catch (Exception e) {
			// Solution: Stop or Running
			// logging
			System.out.println("All Exception");
		} finally {
			System.out.println("finally ");
			System.out.println("+++++++ ");
			System.out.println("+++++++ ");
		}
		//		catch (NullPointerException | ArithmeticException e) {
		//			System.out.println("All Exception");
		//		}
		*/
		//
		/*-
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int k = -1;
		while (k < 0) {
			System.out.print("k = ");
			try {
				k = Integer.parseInt(br.readLine());
			} catch (NumberFormatException | IOException e) {
				System.out.println("Invalid Data, Please Repeat");
				// System.exit(0);
			}
		}
		//br = null;
		if (br != null) {
			try {
				br.close();
			} catch (NullPointerException | IOException e) {
			}
		}
		System.out.println("result = " + k);
		*/
		/*-
		int k = -1;
		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			while (k < 0) {
				System.out.print("k = ");
				try {
					k = Integer.parseInt(br.readLine());
				} catch (NumberFormatException | IOException e) {
					System.out.println("Invalid Data, Please Repeat");
				}
			}
		} catch (Exception e) {
			System.out.println("Exception Found");
		} finally {
			System.out.println("finally");
			if (br != null) {
				try {
					br.close();
				} catch (NullPointerException | IOException e) {
				}
			}
		}
		System.out.println("result = " + k);
		*/
		/*-
		int k = -1;
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			while (k < 0) {
				System.out.print("k = ");
				try {
					k = Integer.parseInt(br.readLine());
				} catch (NumberFormatException | IOException e) {
					System.out.println("Invalid Data, Please Repeat");
				}
			}
		} catch (Exception e) {
			System.out.println("Exception Found");
		} 
		System.out.println("result = " + k);
		*/
	}
}
