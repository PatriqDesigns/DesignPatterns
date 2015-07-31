package com.patriqdesigns.patterns.strategy.duckusim.behaviour;

/**
 * Created by Andre on 15/07/15.
 */
public class SqueakBehaviour implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Squeak!");
    }
}
