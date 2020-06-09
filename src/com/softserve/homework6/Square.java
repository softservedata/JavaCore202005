package com.softserve.homework6;

public class Square implements Figure{
    private final double SIDE;

    public Square(double side) {
        this.SIDE = side;
    }

    @Override
    public double perimeter() {
        return this.SIDE * 4;
    }
}
