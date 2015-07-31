package com.patriqdesigns.patterns.strategy.duckusim.duck;

import com.patriqdesigns.patterns.strategy.duckusim.behaviour.NormalQuackBehaviour;
import com.patriqdesigns.patterns.strategy.duckusim.behaviour.WingsFlyBehaviour;

/**
 * Created by Andre on 15/07/15.
 */
public class MallardDuck extends Duck {
    public MallardDuck() {
        setFlyBehavior(new WingsFlyBehaviour());
        setQuackBehaviour(new NormalQuackBehaviour());
    }

    @Override
    public void display() {
        System.out.println("Im a Mallard duck!");
    }
}
