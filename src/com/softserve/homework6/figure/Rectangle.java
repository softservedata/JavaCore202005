package com.softserve.homework6.figure;

public class Rectangle implements Figure {
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void printPerimeter() {
        System.out.println("The perimeter is " + (2 * (length + width)));
    }
}
