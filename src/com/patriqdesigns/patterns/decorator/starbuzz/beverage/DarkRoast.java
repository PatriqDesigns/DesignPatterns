package com.patriqdesigns.patterns.decorator.starbuzz.beverage;

/**
 * Created by Andre on 15/07/15.
 */
public class DarkRoast extends Beverage {
    @Override
    public String getDescription() {
        return "Dark Roast";
    }

    @Override
    public float cost() {
        return 0.99f;
    }
}
