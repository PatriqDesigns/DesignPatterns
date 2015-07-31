package com.patriqdesigns.patterns.iterator.javawaitress.menu;

import com.patriqdesigns.patterns.iterator.javawaitress.iterator.DinerMenuIterator;
import com.patriqdesigns.patterns.iterator.javawaitress.MenuItem;

import java.util.Iterator;

/**
 * Created by Andre on 23/07/15.
 */
public class DinerMenu implements Menu {

    private static final int MAX_ITEMS = 6;
    private int numberOfItems = 0;
    private MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
        addItem("Vegetarian BLT", "(Fakin') Bacon with lettuce & tomato on whole wheat", true, 2.99);
        addItem("BLT", "Bacon with lettuce & tomato on whole wheat", false, 2.99);
        addItem("Soup of the day", "Soup of the day, with a side of potato salad", false, 3.29);
        addItem("Hotdog", "A hot dog, with saurkraut, relish, onions, topped with cheese", false, 3.05);        // a couple of other Diner Menu items added here
    }

    @Override
    public MenuItem addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems < 6) {
            menuItems[numberOfItems++] = menuItem;
            return menuItem;
        }
        return null;
    }

    @Override
    public Iterator<MenuItem> iterator() {
        return new DinerMenuIterator(menuItems);
    }
}
