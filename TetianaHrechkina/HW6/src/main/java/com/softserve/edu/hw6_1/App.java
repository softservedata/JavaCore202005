package com.softserve.edu.hw6_1;

public class App {
    public static void main(String[] args) {
        Bird bird[] = new Bird[]{
                new Eagle(),
                new Swallow(),
                new Chicken(),
                new Penguin()
        };
        for (int i = 0; i < bird.length ; i++) {
            System.out.print(bird[i].toString() + " - ");
            bird[i].fly();

        }
    }
}
