package com.patriqdesigns.patterns.factory.pizzastore.store;

import com.patriqdesigns.patterns.factory.pizzastore.pizza.Pizza;
import com.patriqdesigns.patterns.factory.pizzastore.pizza.PizzaType;

/**
 * Created by Andre on 16/07/15.
 */
public abstract class PizzaStore {

    public Pizza orderPizza(PizzaType type) {
        Pizza pizza = createPizza(type);
        if(pizza != null){
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }
        return pizza;
    }

    public abstract Pizza createPizza(PizzaType type);
}
