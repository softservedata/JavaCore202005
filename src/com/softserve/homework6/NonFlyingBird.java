package com.softserve.homework6;

public abstract class NonFlyingBird implements Bird{
    @Override
    public void fly() {
        System.out.println("Non Flying Bird!");
    }
}
