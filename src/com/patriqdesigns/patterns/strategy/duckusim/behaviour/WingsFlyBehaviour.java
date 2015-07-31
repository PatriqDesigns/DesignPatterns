package com.patriqdesigns.patterns.strategy.duckusim.behaviour;

/**
 * Created by Andre on 15/07/15.
 */
public class WingsFlyBehaviour implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Flying with my wings!");
    }
}
