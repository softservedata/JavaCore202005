package com.softserve.edu.hw6_2;

public class Rectangle implements Figure{
    private int width, height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public int perimetr() {
        return (2 * (width + height));
    }

    @Override
    public String toString() {
        return "Rectangle";
    }
}
