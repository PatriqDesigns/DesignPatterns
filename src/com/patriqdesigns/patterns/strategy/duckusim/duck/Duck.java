package com.patriqdesigns.patterns.strategy.duckusim.duck;

import com.patriqdesigns.patterns.strategy.duckusim.behaviour.FlyBehavior;
import com.patriqdesigns.patterns.strategy.duckusim.behaviour.QuackBehaviour;

/**
 * Created by Andre on 15/07/15.
 */
public abstract class Duck {

    private FlyBehavior flyBehavior;
    private QuackBehaviour quackBehaviour;

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehaviour.quack();
    }

    public void swim() {
        System.out.println("Ima duck so I can always swim!");
    }

    public void display() {

    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }
}
