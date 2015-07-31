package com.patriqdesigns.patterns.iterator.javawaitress;

import com.patriqdesigns.patterns.iterator.javawaitress.menu.CafeMenu;
import com.patriqdesigns.patterns.iterator.javawaitress.menu.DinerMenu;
import com.patriqdesigns.patterns.iterator.javawaitress.menu.Menu;
import com.patriqdesigns.patterns.iterator.javawaitress.menu.PancakeHouseMenu;

/**
 * Created by Andre on 23/07/15.
 */
public class Main {
    public static void main(String[] args) {
        Waitress waitress = new Waitress(
                new String[]{"Breakfast", "Lunch", "Dinner"},
                new Menu[]{new PancakeHouseMenu(), new DinerMenu(), new CafeMenu()}
        );
        waitress.printMenu();
    }
}
