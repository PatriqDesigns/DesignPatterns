package com.patriqdesigns.patterns.factory.pizzastore.pizza;

import com.patriqdesigns.patterns.factory.pizzastore.ingredient.*;

import java.util.Arrays;

/**
 * Created by Andre on 16/07/15.
 */
public abstract class Pizza {

    protected Dough dough;
    protected Sauce sauce;
    protected Veggie[] veggies;
    protected Cheese cheese;
    protected Pepperoni pepperoni;
    protected Clams clams;
    private String name;

    public abstract void prepare();

    public void bake() {
        System.out.println("Banking for 25 minutes at 350.");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices.");
    }

    public void box() {
        System.out.println("Boxing in the official PizzaStore box.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", clams=" + clams +
                ", pepperoni=" + pepperoni +
                ", cheese=" + cheese +
                ", veggies=" + Arrays.toString(veggies) +
                ", sauce=" + sauce +
                ", dough=" + dough +
                '}';
    }
}
