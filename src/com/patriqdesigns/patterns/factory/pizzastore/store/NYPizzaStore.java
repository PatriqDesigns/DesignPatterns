package com.patriqdesigns.patterns.factory.pizzastore.store;

import com.patriqdesigns.patterns.factory.pizzastore.ingredient.factory.NYPizzaIngredientFactory;
import com.patriqdesigns.patterns.factory.pizzastore.ingredient.factory.PizzaIngredientFactory;
import com.patriqdesigns.patterns.factory.pizzastore.pizza.*;

/**
 * Created by Andre on 16/07/15.
 */
public class NYPizzaStore extends PizzaStore {

    private PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

    @Override
    public Pizza createPizza(PizzaType type) {
        Pizza pizza = null;
        if (type.equals(PizzaType.CHEESE)) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        } else if (type.equals(PizzaType.VEGGIE)) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("New York Style Veggie Pizza");
        } else if (type.equals(PizzaType.CLAM)) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("New York Style Clam Pizza");
        } else if (type.equals(PizzaType.PEPPERONI)) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("New York Style Pepperoni Pizza");
        }else{
            System.out.println("Invalid pizza type.");
        }
        return pizza;
    }

}
