package com.patriqdesigns.patterns.templatemethod.starbuzzrecipe;

import com.patriqdesigns.patterns.templatemethod.starbuzzrecipe.recipe.CoffeeWithHook;
import com.patriqdesigns.patterns.templatemethod.starbuzzrecipe.template.CaffeineBeverage;

/**
 * Created by Andre on 21/07/15.
 */
public class Main {
    public static void main(String[] args) {
        CaffeineBeverage tea = new CoffeeWithHook();
        tea.prepareRecipe();
    }
}
