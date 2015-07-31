package com.patriqdesigns.patterns.decorator.starbuzz.condiment;

import com.patriqdesigns.patterns.decorator.starbuzz.beverage.Beverage;

/**
 * Created by Andre on 15/07/15.
 */
public class Whip extends BeverageCondiment {

    public Whip(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public float cost() {
        return beverage.cost() + 0.10f;
    }
}
