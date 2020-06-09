package com.softserve.edu.hw6.Bird;


public class Swallow extends FlyingBird {

    private boolean a = true;

    @Override
    public boolean fly() {
        return true;
    }

    @Override
    public String toString() {
        return "Swallow{" +
                "canFly? - " + a +
                '}';
    }
}
