package com.softserve.homework8;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        Map<String, String> numbers = new HashMap<>();
        Map<String, String> names = new HashMap<>();
        String number, name;

        numbers.put("101", "Ivan");
        numbers.put("102", "Oleg");
        numbers.put("103", "Petro");
        numbers.put("104", "Vasil");
        numbers.put("105", "Petro");
        numbers.put("106", "Vasil");

        System.out.println(numbers);

        for(Map.Entry<String, String> entry: numbers.entrySet()) {
            number = entry.getKey();
            name = entry.getValue();

            if(names.containsKey(name)) {
                number = names.get(name) + ", " + number;
            }
            names.put(name, number);
        }
        System.out.println(names);
    }
}
