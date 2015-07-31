package com.patriqdesigns.patterns.adapter.duckandturkey.turkey;

/**
 * Created by Andre on 21/07/15.
 */
public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("Gobble gobble!");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying short distances!");
    }
}
