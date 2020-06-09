package com.softserve.edu.hw6.Figure;

public class Square implements Figure {

	public double side;

	public Square (double side) {
	    this.side = side;
	}


	@Override
	public double getPerimeter(){
		return side*4;
	}

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
}