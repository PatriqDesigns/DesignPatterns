package com.patriqdesigns.patterns.factory.pizzastore.pizza;

import com.patriqdesigns.patterns.factory.pizzastore.ingredient.factory.PizzaIngredientFactory;
import com.patriqdesigns.patterns.factory.pizzastore.pizza.Pizza;

/**
 * Created by Andre on 16/07/15.
 */
public class PepperoniPizza extends Pizza {

    private PizzaIngredientFactory ingredientFactory;

    public PepperoniPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing "+getName());
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        pepperoni = ingredientFactory.createPepperoni();
    }
}
