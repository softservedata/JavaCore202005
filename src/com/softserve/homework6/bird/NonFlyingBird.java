package com.softserve.homework6.bird;

public abstract class NonFlyingBird implements Bird {
    @Override
    public void fly() {
        System.out.println("This is a " + NonFlyingBird.class.getSimpleName() + " - " + this.getClass().getSimpleName());
    }
}
