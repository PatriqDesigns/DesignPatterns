package com.patriqdesigns.patterns.templatemethod.starbuzzrecipe.recipe;

import com.patriqdesigns.patterns.templatemethod.starbuzzrecipe.template.CaffeineBeverage;

/**
 * Created by Andre on 21/07/15.
 */
public class Tea extends CaffeineBeverage {
    @Override
    public void brew() {
        System.out.println("Steeping the tea.");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding Lemon.");
    }
}
