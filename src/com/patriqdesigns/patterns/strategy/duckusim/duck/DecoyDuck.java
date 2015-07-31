package com.patriqdesigns.patterns.strategy.duckusim.duck;

import com.patriqdesigns.patterns.strategy.duckusim.behaviour.NoFlyBehaviour;
import com.patriqdesigns.patterns.strategy.duckusim.behaviour.NoQuackBehaviour;

/**
 * Created by Andre on 15/07/15.
 */
public class DecoyDuck extends Duck {
    public DecoyDuck() {
        setFlyBehavior(new NoFlyBehaviour());
        setQuackBehaviour(new NoQuackBehaviour());
    }

    @Override
    public void display() {
        System.out.println("Im a decoy duck!");
    }
}
