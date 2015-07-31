package com.patriqdesigns.patterns.strategy.duckusim.duck;

import com.patriqdesigns.patterns.strategy.duckusim.behaviour.NoFlyBehaviour;
import com.patriqdesigns.patterns.strategy.duckusim.behaviour.SqueakBehaviour;

/**
 * Created by Andre on 15/07/15.
 */
public class RubberDuck extends Duck {
    public RubberDuck() {
        setFlyBehavior(new NoFlyBehaviour());
        setQuackBehaviour(new SqueakBehaviour());
    }

    @Override
    public void display() {
        System.out.println("Im a rubber duck!");
    }
}
