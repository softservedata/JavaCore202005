package com.softserve.homework6.bird;

public abstract class FlyingBird implements Bird {
    @Override
    public void fly() {
        System.out.println("The is a " + FlyingBird.class.getSimpleName() + " - " + this.getClass().getSimpleName());
    }
}
