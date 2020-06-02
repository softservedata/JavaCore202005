package com.softserve.homework5;

import java.util.HashSet;

public class Appl {
    public static void main(String[] args) {
        HashSet<String> products = new HashSet<>();
        Product prod1 = new Product("Prod4", 1);
        Product prod2 = new Product("Prod2", 2);
        Product prod3 = new Product("Prod3", 3);
        Product prod4 = new Product("Prod4", 4);

        products.add(prod1.getName());
        products.add(prod2.getName());
        products.add(prod3.getName());
        products.add(prod4.getName());

        System.out.println("Unique products: " + products);
    }
}
