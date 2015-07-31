package com.patriqdesigns.patterns.strategy.duckusim;

import com.patriqdesigns.patterns.strategy.duckusim.duck.DecoyDuck;
import com.patriqdesigns.patterns.strategy.duckusim.duck.Duck;
import com.patriqdesigns.patterns.strategy.duckusim.duck.MallardDuck;
import com.patriqdesigns.patterns.strategy.duckusim.duck.RubberDuck;

/**
 * Created by Andre on 15/07/15.
 */
public class Main {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();
        mallard.display();

        Duck rubber = new RubberDuck();
        rubber.performFly();
        rubber.performQuack();
        rubber.display();

        Duck decoy = new DecoyDuck();
        decoy.performFly();
        decoy.performQuack();
        decoy.display();
    }
}
