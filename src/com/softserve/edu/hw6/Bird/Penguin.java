package com.softserve.edu.hw6.Bird;

import com.softserve.edu.hw6.Bird.NonFlyingBird;

public class Penguin extends NonFlyingBird {

    private boolean a;

    @Override
    public boolean fly() {
        return false;
    }

    @Override
    public String toString() {
        return "Penguin{" +
                "canFly? - " + a +
                '}';
    }
}
