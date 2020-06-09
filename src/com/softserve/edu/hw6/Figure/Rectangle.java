package com.softserve.edu.hw6.Figure;

public class Rectangle implements Figure {

    public double width;
    public double height;


    public Rectangle (double width, double height) {
        this.width = width;
        this.height = height;

    }


    @Override
    public double getPerimeter(){
        return (width+height)*2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
