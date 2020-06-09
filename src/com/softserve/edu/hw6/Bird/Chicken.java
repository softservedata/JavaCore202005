package com.softserve.edu.hw6.Bird;

public class Chicken extends NonFlyingBird {

    private boolean a;

    @Override
    public boolean fly() {
        return false;
    }

    @Override
    public String toString() {
        return "Chicken{" +
                "canFly? - " + a +
                '}';
    }
}
