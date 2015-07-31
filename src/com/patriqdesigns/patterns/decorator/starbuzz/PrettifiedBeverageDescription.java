package com.patriqdesigns.patterns.decorator.starbuzz;

import com.patriqdesigns.patterns.decorator.starbuzz.beverage.Beverage;
import com.patriqdesigns.patterns.decorator.starbuzz.condiment.BeverageCondiment;

import java.util.HashMap;

/**
 * Created by Andre on 16/07/15.
 */
public class PrettifiedBeverageDescription extends BeverageCondiment {

    public PrettifiedBeverageDescription(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        String[] condiments = beverage.getDescription().split(", ");
        StringBuilder builder = new StringBuilder(condiments[0]);
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (int i = 1; i < condiments.length; i++) {
            String condiment = condiments[i];
            map.put(condiment, (map.containsKey(condiment) ? map.get(condiment) : 0) + 1);
        }
        for (String key : map.keySet()) {
            builder.append(", ").append(transform(map.get(key))).append(" ").append(key);
        }
        return builder.toString();
    }

    public String transform(int quantity) {
        switch (quantity) {
            case 1:
                return "One";
            case 2:
                return "Double";
            case 3:
                return "Triple";
            default:
                return Integer.toString(quantity);
        }
    }

    @Override
    public float cost() {
        return beverage.cost();
    }
}
