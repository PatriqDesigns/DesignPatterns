package com.patriqdesigns.patterns.factory.pizzastore.ingredient.factory;

import com.patriqdesigns.patterns.factory.pizzastore.ingredient.*;

/**
 * Created by Andre on 16/07/15.
 */
public interface PizzaIngredientFactory {
    public Dough createDough();

    public Sauce createSauce();

    public Cheese createCheese();

    public Veggie[] createVeggies();

    public Pepperoni createPepperoni();

    public Clams createClams();
}
