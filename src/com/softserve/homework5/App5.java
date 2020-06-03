package com.softserve.homework5;

public class App5 {

	public static void main(String[] args) {

		Product p1 = new Product("Gold", 1737.56);
		Product p2 = new Product("Silver", 18.19);
		Product p3 = new Product("Platinum", 843.50);
		Product p4 = new Product("Palladium", 1960.95);
		
		System.out.println( p1);
		if (!(p1.equals(p2))) { System.out.println( p2);
		} if (!(p1.equals(p3)) && !(p2.equals(p3)) )
		{ System.out.println( p3);
		if (!(p1.equals(p4)) && !(p2.equals(p4)) && !(p3.equals(p4))){ 
			System.out.println(p4);
		}
		}
	}
}
