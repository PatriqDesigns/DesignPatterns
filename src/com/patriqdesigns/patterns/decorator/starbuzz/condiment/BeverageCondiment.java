package com.patriqdesigns.patterns.decorator.starbuzz.condiment;

import com.patriqdesigns.patterns.decorator.starbuzz.beverage.Beverage;

/**
 * Created by Andre on 15/07/15.
 */
public abstract class BeverageCondiment extends Beverage {
    protected Beverage beverage;

    public BeverageCondiment(Beverage beverage){
        this.beverage = beverage;
    }
}
