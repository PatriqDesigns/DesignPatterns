package com.patriqdesigns.patterns.decorator.starbuzz.condiment;

import com.patriqdesigns.patterns.decorator.starbuzz.beverage.Beverage;

/**
 * Created by Andre on 15/07/15.
 */
public class Mocha extends BeverageCondiment {

    public Mocha(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public float cost() {
        return beverage.cost() + 0.20f;
    }
}
