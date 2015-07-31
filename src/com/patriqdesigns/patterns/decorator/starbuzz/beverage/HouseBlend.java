package com.patriqdesigns.patterns.decorator.starbuzz.beverage;

/**
 * Created by Andre on 15/07/15.
 */
public class HouseBlend extends Beverage {
    @Override
    public String getDescription() {
        return "House Blend";
    }

    @Override
    public float cost() {
        return 0.89f;
    }
}
