package com.softserve.edu12;

public class ApplForm {
	public static void main(String[] args) {
		DialogTime dt = new DialogTime();
		dt.setVisible(true);
		System.out.println("main(): Thread ID = " + Thread.currentThread().getId());
	}
}
