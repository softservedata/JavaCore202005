package com.softserve.edu.hw6_2;

public class Appl {
    public static void main(String[] args) {
        Figure figure[]= new Figure[] {
                new Rectangle(2,3),
                new Rectangle(4,9),
                new Square(7),
                new Square(22),
                new Square(44)
        };
        for (int i = 0; i < figure.length; i++) {
            System.out.println("Perimetr of " + figure[i].toString() + " : " + figure[i].perimetr());
        }
    }
}
