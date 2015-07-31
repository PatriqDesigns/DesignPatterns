package com.patriqdesigns.patterns.factory.pizzastore.pizza;

import com.patriqdesigns.patterns.factory.pizzastore.ingredient.factory.PizzaIngredientFactory;

/**
 * Created by Andre on 16/07/15.
 */
public class VeggiePizza extends Pizza {

    private PizzaIngredientFactory ingredientFactory;

    public VeggiePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing "+getName());
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        veggies = ingredientFactory.createVeggies();
    }
}
