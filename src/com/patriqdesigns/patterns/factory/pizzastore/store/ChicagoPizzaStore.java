package com.patriqdesigns.patterns.factory.pizzastore.store;

import com.patriqdesigns.patterns.factory.pizzastore.ingredient.factory.ChicagoPizzaIgredientFactoy;
import com.patriqdesigns.patterns.factory.pizzastore.ingredient.factory.PizzaIngredientFactory;
import com.patriqdesigns.patterns.factory.pizzastore.pizza.*;

/**
 * Created by Andre on 16/07/15.
 */
public class ChicagoPizzaStore extends PizzaStore {

    private PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIgredientFactoy();

    @Override
    public Pizza createPizza(PizzaType type) {
        Pizza pizza = null;
        if (type.equals(PizzaType.CHEESE)) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Chicago Style Cheese Pizza");
        } else if (type.equals(PizzaType.VEGGIE)) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("Chicago Style Veggie Pizza");
        } else if (type.equals(PizzaType.CLAM)) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("Chicago Style Clam Pizza");
        } else if (type.equals(PizzaType.PEPPERONI)) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("Chicago Style Pepperoni Pizza");
        }else{
            System.out.println("Invalid pizza type.");
        }
        return pizza;
    }



}
