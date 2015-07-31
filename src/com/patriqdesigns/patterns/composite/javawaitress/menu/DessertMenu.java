package com.patriqdesigns.patterns.composite.javawaitress.menu;

import com.patriqdesigns.patterns.composite.javawaitress.composite.Menu;
import com.patriqdesigns.patterns.composite.javawaitress.composite.MenuItem;

/**
 * Created by Andre on 23/07/15.
 */
public class DessertMenu extends Menu {

    public DessertMenu() {
        super("Dessert menu", "Dessert of course!");
        add(new MenuItem("Apple Pie", "Apple pie with a flakey crust, topped with vanilla icecream", true, 1.59));
        add(new MenuItem("Cheesecake", "Creamy York cheesecake, with a chocolate graham crust", true, 1.99));
        add(new MenuItem("Sorbet", "A scoop of raspberry and a scoop of lime", true, 1.89));
    }

}
