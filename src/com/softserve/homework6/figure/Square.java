package com.softserve.homework6.figure;


public class Square implements Figure {
    private int sideLength;

    public Square(int side) {
        this.sideLength = side;
    }


    @Override
    public void printPerimeter() {
        System.out.println("Perimeter is - " + (4 * sideLength));
    }
}
