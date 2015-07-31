package com.patriqdesigns.patterns.iterator.javawaitress.menu;

import com.patriqdesigns.patterns.iterator.javawaitress.MenuItem;

import java.util.Hashtable;
import java.util.Iterator;

/**
 * Created by Andre on 23/07/15.
 */
public class CafeMenu implements Menu {

    private Hashtable<String, MenuItem> menuItems;

    public CafeMenu() {
        menuItems = new Hashtable<String, MenuItem>();
        addItem("Veggie Burger and Air Fries", "Veggie burger on a whole wheat bun, lettuce, tomato, and fries", true, 3.99);
        addItem("Soup of the day", "A cup of the soup of the day, with a side salad", false, 3.69);
        addItem("Burrito", "A large burrito, with whole pinto beans, salsa, guacamole", true, 4.29);
    }

    @Override
    public MenuItem addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.put(menuItem.getName(), menuItem);
        return menuItem;
    }

    @Override
    public Iterator<MenuItem> iterator() {
        return menuItems.values().iterator();
    }
}
