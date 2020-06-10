package com.softserve.edu7;

//public class BoxGen<T extends IMy> {
public class BoxGen<T> {
	private T obj;

	public T get() {
		return obj;
	}

	public void set(T obj) {
		this.obj = obj;
	}

}
