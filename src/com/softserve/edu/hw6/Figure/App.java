package com.softserve.edu.hw6.Figure;

public class App {
    public static void main(String[] args) {
        Figure[] figures = {
                new Square(1),
                new Square(2),
                new Square(3),
                new Rectangle(4, 4),
                new Rectangle(5, 5)
        };

        for (Figure current : figures) {
            System.out.println( current.toString() + " " +current.getPerimeter());
        }
    }
}

