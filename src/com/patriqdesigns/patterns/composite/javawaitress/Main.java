package com.patriqdesigns.patterns.composite.javawaitress;

import com.patriqdesigns.patterns.composite.javawaitress.composite.Menu;
import com.patriqdesigns.patterns.composite.javawaitress.composite.MenuComponent;
import com.patriqdesigns.patterns.composite.javawaitress.menu.CafeMenu;
import com.patriqdesigns.patterns.composite.javawaitress.menu.DinerMenu;
import com.patriqdesigns.patterns.composite.javawaitress.menu.PancakeHouseMenu;
import com.patriqdesigns.patterns.composite.javawaitress.menu.VegetarianMenu;

/**
 * Created by Andre on 23/07/15.
 */
public class Main {
    public static void main(String[] args) {
        MenuComponent allMenus = new Menu("All menus", "All menus combined.");
        allMenus.add(new PancakeHouseMenu());
        allMenus.add(new DinerMenu());
        allMenus.add(new CafeMenu());

        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();
        waitress.printVegetarianMenu();
    }
}
