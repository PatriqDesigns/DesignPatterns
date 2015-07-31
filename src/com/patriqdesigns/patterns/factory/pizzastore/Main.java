package com.patriqdesigns.patterns.factory.pizzastore;

import com.patriqdesigns.patterns.factory.pizzastore.pizza.PizzaType;
import com.patriqdesigns.patterns.factory.pizzastore.store.ChicagoPizzaStore;
import com.patriqdesigns.patterns.factory.pizzastore.store.NYPizzaStore;
import com.patriqdesigns.patterns.factory.pizzastore.store.PizzaStore;

/**
 * Created by Andre on 16/07/15.
 */
public class Main {
    public static void main(String[] args) {
        PizzaStore chicagoStore = new ChicagoPizzaStore();
        System.out.println(chicagoStore.orderPizza(PizzaType.CHEESE));
        PizzaStore nyPizzaStore = new NYPizzaStore();
        System.out.println(nyPizzaStore.orderPizza(PizzaType.CLAM));
    }
}
