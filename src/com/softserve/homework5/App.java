package com.softserve.homework5;

public class App {
    public static void main(String[] args) {
        Product pr1 = new Product("Phone", 400);
        Product pr2 = new Product("Laptop", 500);
        Product pr3 = new Product("Phone", 200);
        Product pr4 = new Product("Laptop", 400);

        System.out.println(pr1 + " pr1");

        if (!pr1.equals(pr2))
            System.out.println(pr2 + " pr2");

        if (!pr3.equals(pr2) && !pr3.equals(pr1))
            System.out.println(pr3+ " pr3");

        if (!pr4.equals(pr1) && !pr4.equals(pr2) && !pr4.equals(pr3))
            System.out.println(pr4 + " pr4");

    }
}
