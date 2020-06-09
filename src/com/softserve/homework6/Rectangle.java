package com.softserve.homework6;

public class Rectangle implements Figure{
    private final double WIDTH, HEIGHT;

    public Rectangle(double width, double height) {
        this.WIDTH = width;
        this.HEIGHT = height;
    }

    @Override
    public double perimeter() {
        return (this.WIDTH + this.HEIGHT) * 2;
    }
}
