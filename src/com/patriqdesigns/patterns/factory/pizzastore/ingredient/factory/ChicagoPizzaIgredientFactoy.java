package com.patriqdesigns.patterns.factory.pizzastore.ingredient.factory;

import com.patriqdesigns.patterns.factory.pizzastore.ingredient.*;
import com.patriqdesigns.patterns.factory.pizzastore.ingredient.chigagoingredient.FrozenClams;
import com.patriqdesigns.patterns.factory.pizzastore.ingredient.chigagoingredient.MozzarellaCheese;
import com.patriqdesigns.patterns.factory.pizzastore.ingredient.chigagoingredient.PlumTomatoSauce;
import com.patriqdesigns.patterns.factory.pizzastore.ingredient.chigagoingredient.ThickCrustDough;
import com.patriqdesigns.patterns.factory.pizzastore.ingredient.chigagoingredient.veggie.BlackOlives;
import com.patriqdesigns.patterns.factory.pizzastore.ingredient.chigagoingredient.veggie.Eggplant;
import com.patriqdesigns.patterns.factory.pizzastore.ingredient.chigagoingredient.veggie.Spinach;

/**
 * Created by Andre on 16/07/15.
 */
public class ChicagoPizzaIgredientFactoy implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Veggie[] createVeggies() {
        return new Veggie[]{new BlackOlives(), new Eggplant(), new Spinach()};
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClams() {
        return new FrozenClams();
    }
}
