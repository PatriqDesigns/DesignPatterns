package com.patriqdesigns.patterns.decorator.starbuzz.condiment;

import com.patriqdesigns.patterns.decorator.starbuzz.beverage.Beverage;

/**
 * Created by Andre on 15/07/15.
 */
public class SteamedMilk extends BeverageCondiment {

    public SteamedMilk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Steamed Milk";
    }

    @Override
    public float cost() {
        return beverage.cost() + 0.10f;
    }
}
