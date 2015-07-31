package com.patriqdesigns.patterns.composite.javawaitress.menu;

import com.patriqdesigns.patterns.composite.javawaitress.composite.Menu;
import com.patriqdesigns.patterns.composite.javawaitress.composite.MenuComponent;

import java.util.Iterator;

/**
 * Created by Andre on 23/07/15.
 */
public class VegetarianMenu extends Menu {

    public VegetarianMenu(MenuComponent allMenus) {
        super("Vegetarian menu", "What all vegans like to eat!");
        Iterator<MenuComponent> menuComponentIterator = allMenus.iterator();
        while(menuComponentIterator.hasNext()){
            MenuComponent menuComponent = menuComponentIterator.next();
            try {
                if(menuComponent.isVegetarian()){
                    add(menuComponent);
                }
            } catch (UnsupportedOperationException ignored) {}
        }
    }
}
