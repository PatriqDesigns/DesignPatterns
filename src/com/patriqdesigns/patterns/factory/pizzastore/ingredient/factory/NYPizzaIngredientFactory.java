package com.patriqdesigns.patterns.factory.pizzastore.ingredient.factory;

import com.patriqdesigns.patterns.factory.pizzastore.ingredient.*;
import com.patriqdesigns.patterns.factory.pizzastore.ingredient.nyingredient.FreshClams;
import com.patriqdesigns.patterns.factory.pizzastore.ingredient.nyingredient.MarianaSauce;
import com.patriqdesigns.patterns.factory.pizzastore.ingredient.nyingredient.ReggianoCheese;
import com.patriqdesigns.patterns.factory.pizzastore.ingredient.nyingredient.ThinCrustDough;
import com.patriqdesigns.patterns.factory.pizzastore.ingredient.nyingredient.veggie.Garlic;
import com.patriqdesigns.patterns.factory.pizzastore.ingredient.nyingredient.veggie.Mushroom;
import com.patriqdesigns.patterns.factory.pizzastore.ingredient.nyingredient.veggie.Onion;
import com.patriqdesigns.patterns.factory.pizzastore.ingredient.nyingredient.veggie.RedPepper;

/**
 * Created by Andre on 16/07/15.
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarianaSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggie[] createVeggies() {
        return new Veggie[]{new Garlic(), new Mushroom(), new Onion(), new RedPepper()};
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClams() {
        return new FreshClams();
    }
}
