package com.patriqdesigns.patterns.composite.javawaitress.menu;

import com.patriqdesigns.patterns.composite.javawaitress.composite.Menu;
import com.patriqdesigns.patterns.composite.javawaitress.composite.MenuItem;

/**
 * Created by Andre on 23/07/15.
 */
public class PancakeHouseMenu extends Menu {

    public PancakeHouseMenu() {
        super("Pancake house menu", "Tasty breakfasts!");
        add(new MenuItem("K&B's Pancake Breakfast", "Pancakes with scrambled eggs, and toast", true, 2.99));
        add(new MenuItem("Regular Pancake Breakfast", "Pancakes with fried eggs, sausage", false, 2.99));
        add(new MenuItem("Blueberry Pancakes", "Pancakes made with fresh blueberries", true, 3.49));
        add(new MenuItem("Waffles", "Waffles, with your choice of blueberries or strawberries", true, 3.59));
    }

}
