package com.softserve.homework6.figure;

public class App {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(20, 10);
        Rectangle rectangle2 = new Rectangle(34, 12);
        Square square1 = new Square(25);
        Square square2 = new Square(40);
        Square square3 = new Square(60);

        Figure[] figures = new Figure[]{rectangle1,
        rectangle2, square1, square2, square3};

        for (Figure figure : figures) {
            figure.printPerimeter();
        }
    }
}
