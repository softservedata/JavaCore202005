package com.softserve.edu.hw6_2;

public class Square implements Figure{
    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public int perimetr() {
        return 4 * side;
    }

    @Override
    public String toString() {
        return "Square";
    }
}
