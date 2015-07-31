package com.patriqdesigns.patterns.strategy.duckusim.behaviour;

/**
 * Created by Andre on 15/07/15.
 */
public class NoFlyBehaviour implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Can't fly!");
    }
}
