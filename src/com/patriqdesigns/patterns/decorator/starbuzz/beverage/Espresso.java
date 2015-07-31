package com.patriqdesigns.patterns.decorator.starbuzz.beverage;

/**
 * Created by Andre on 15/07/15.
 */
public class Espresso extends Beverage {
    @Override
    public String getDescription() {
        return "Espresso";
    }

    @Override
    public float cost() {
        return 1.99f;
    }
}
