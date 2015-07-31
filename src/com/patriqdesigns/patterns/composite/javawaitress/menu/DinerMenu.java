package com.patriqdesigns.patterns.composite.javawaitress.menu;

import com.patriqdesigns.patterns.composite.javawaitress.composite.Menu;
import com.patriqdesigns.patterns.composite.javawaitress.composite.MenuItem;

/**
 * Created by Andre on 23/07/15.
 */
public class DinerMenu extends Menu {

    public DinerMenu() {
        super("Diner house menu", "Tastiest lunches ever.");
        add(new MenuItem("Vegetarian BLT", "(Fakin') Bacon with lettuce & tomato on whole wheat", true, 2.99));
        add(new MenuItem("BLT", "Bacon with lettuce & tomato on whole wheat", false, 2.99));
        add(new MenuItem("Soup of the day", "Soup of the day, with a side of potato salad", false, 3.29));
        add(new MenuItem("Hotdog", "A hot dog, with saurkraut, relish, onions, topped with cheese", false, 3.05));
        add(new DessertMenu());
    }
}
