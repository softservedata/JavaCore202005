package com.softserve.homework5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        Product product1 = new Product("Carrot", 4.89);
        Product product2 = new Product("Greens", 9.94);
        Product product3 = new Product("Carrot", 4.89);
        Product product4 = new Product("Tomat", 20.92);

        List<Product> listWithDuplicates = new ArrayList<Product>();
        listWithDuplicates.add(product1);
        listWithDuplicates.add(product2);
        listWithDuplicates.add(product3);
        listWithDuplicates.add(product4);

        List<Product> listWithoutDuplicates = listWithDuplicates.stream()
                .distinct()
                .collect(Collectors.toList());

        for (int i = 0; i < listWithoutDuplicates.size(); i++) {
            System.out.println(listWithoutDuplicates.get(i).toString());
        }
    }
}
