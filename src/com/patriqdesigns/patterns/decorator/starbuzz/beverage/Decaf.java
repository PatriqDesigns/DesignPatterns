package com.patriqdesigns.patterns.decorator.starbuzz.beverage;

/**
 * Created by Andre on 15/07/15.
 */
public class Decaf extends Beverage {
    @Override
    public String getDescription() {
        return "Decaf";
    }

    @Override
    public float cost() {
        return 1.05f;
    }
}
