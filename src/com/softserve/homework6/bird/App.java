package com.softserve.homework6.bird;

public class App {
    public static void main(String[] args) {
        Bird eagle = new Eagle();
        Bird swallow = new Swallow();
        Bird penguin = new Penguin();
        Bird chicken = new Chicken();

        Bird[] birds = new Bird[]{eagle, swallow, penguin, chicken};

        for (Bird bird: birds) {
            bird.fly();
        }
    }
}
