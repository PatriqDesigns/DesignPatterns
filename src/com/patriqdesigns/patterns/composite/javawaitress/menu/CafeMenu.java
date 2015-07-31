package com.patriqdesigns.patterns.composite.javawaitress.menu;

import com.patriqdesigns.patterns.composite.javawaitress.composite.Menu;
import com.patriqdesigns.patterns.composite.javawaitress.composite.MenuItem;

/**
 * Created by Andre on 23/07/15.
 */
public class CafeMenu extends Menu {
    public CafeMenu() {
        super("Cafe house menu", "Tasty Dinners.");
        add(new MenuItem("Veggie Burger and Air Fries", "Veggie burger on a whole wheat bun, lettuce, tomato, and fries", true, 3.99));
        add(new MenuItem("Soup of the day", "A cup of the soup of the day, with a side salad", false, 3.69));
        add(new MenuItem("Burrito", "A large burrito, with whole pinto beans, salsa, guacamole", true, 4.29));
    }



}
