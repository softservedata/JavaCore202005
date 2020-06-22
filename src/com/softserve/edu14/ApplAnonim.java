package com.softserve.edu14;

abstract class Supertype {
	private String name;

	public Supertype(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract void updateName();
	
	@Override
	public String toString() {
		return name;
	}
}

class Childtype extends Supertype {
	
	public Childtype(String name) {
		super(name);
	}
	
	@Override
	public void updateName() {
		setName(getName() + " udated");
	}
}

public class ApplAnonim {
	public static void main(String[] args) {
//		Childtype childtype = new Childtype("Ivan");
//		childtype.updateName();
//		System.out.println("childtype = " + childtype);
		//
		Supertype supertype = new Supertype("Petro") {
			@Override
			public void updateName() {
				setName(getName() + " udated");
			}
		};
		supertype.updateName();
		System.out.println("supertype = " + supertype);
	}
}
