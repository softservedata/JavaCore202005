package com.softserve.homework6;

public class App {
    public static void main(String[] args) {
        System.out.println("1)");
        Bird[] birds = {new Eagle(), new Swallow(), new Penguin(), new Chicken()};
        for(Bird bird : birds) {
            System.out.print(bird + " And it's a ");
            bird.fly();
        }

        System.out.println("\n2)");
        Figure[] figures = {new Rectangle(1.1,2.2), new Rectangle(3.3,4.4),
                new Square(1.1), new Square(2.2), new Square(3.3)};
        System.out.println("Perimeters:");
        for(Figure figure : figures) {
            System.out.println(figure.perimeter());
        }
    }
}
