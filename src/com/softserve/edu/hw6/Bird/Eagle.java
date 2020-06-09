package com.softserve.edu.hw6.Bird;

public class Eagle extends FlyingBird {

    private boolean a = true;


    @Override
    public boolean fly() {
        return a;
    }

    @Override
    public String toString() {
        return "Eagle{" +
                "canFly? - " + a +
                '}';
    }
}

