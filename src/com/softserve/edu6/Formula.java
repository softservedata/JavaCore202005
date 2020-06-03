package com.softserve.edu6;

public interface Formula {
	double calculate(int a); // public abstract

	default double sqr(int a) { // public
		return a * a;
	}
}
