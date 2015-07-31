package com.patriqdesigns.patterns.iterator.javawaitress.menu;

import com.patriqdesigns.patterns.iterator.javawaitress.MenuItem;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Andre on 23/07/15.
 */
public class PancakeHouseMenu implements Menu {

    private ArrayList<MenuItem> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<MenuItem>();
        addItem("K&B's Pancake Breakfast", "Pancakes with scrambled eggs, and toast", true, 2.99);
        addItem("Regular Pancake Breakfast", "Pancakes with fried eggs, sausage", false, 2.99);
        addItem("Blueberry Pancakes", "Pancakes made with fresh blueberries", true, 3.49);
        addItem("Waf?es", "Waf?es, with your choice of blueberries or strawberries", true, 3.59);
    }

    @Override
    public MenuItem addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
        return menuItem;
    }

    @Override
    public Iterator<MenuItem> iterator() {
        return menuItems.iterator();
    }
}
