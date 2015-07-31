package com.patriqdesigns.patterns.adapter.duckandturkey.duck;

/**
 * Created by Andre on 21/07/15.
 */
public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Quack quack!");
    }

    @Override
    public void fly() {
        System.out.println("I'm Flying.");
    }
}
