package com.patriqdesigns.patterns.decorator.starbuzz;

import com.patriqdesigns.patterns.decorator.starbuzz.beverage.Beverage;
import com.patriqdesigns.patterns.decorator.starbuzz.beverage.Decaf;
import com.patriqdesigns.patterns.decorator.starbuzz.condiment.Mocha;
import com.patriqdesigns.patterns.decorator.starbuzz.condiment.Whip;

/**
 * Created by Andre on 15/07/15.
 */
public class Main {
    public static void main(String[] args) {
        Beverage decaf = new Decaf();
        decaf = new Mocha(decaf);
        decaf = new Mocha(decaf);
        decaf = new Whip(decaf);
        decaf = new PrettifiedBeverageDescription(decaf);
        System.out.println("Beverage description: "+decaf.getDescription()+", cost: "+decaf.cost());
    }
}
