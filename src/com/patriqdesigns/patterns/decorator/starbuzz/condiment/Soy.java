package com.patriqdesigns.patterns.decorator.starbuzz.condiment;

import com.patriqdesigns.patterns.decorator.starbuzz.beverage.Beverage;

/**
 * Created by Andre on 15/07/15.
 */
public class Soy extends BeverageCondiment {

    public Soy(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public float cost() {
        return 0.15f;
    }
}
