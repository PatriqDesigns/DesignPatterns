package com.patriqdesigns.patterns.composite.javawaitress.composite;

import com.patriqdesigns.patterns.composite.javawaitress.composite.iterator.CompositeIterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Andre on 23/07/15.
 */
public class Menu extends MenuComponent {

    private Iterator<MenuComponent> iterator;
    private ArrayList<MenuComponent> menuComponents;
    private String name;
    private String description;

    public Menu(String name, String description) {
        menuComponents = new ArrayList<MenuComponent>();
        this.name = name;
        this.description = description;
    }

    @Override
    public void add(MenuComponent component) {
        menuComponents.add(component);
    }

    @Override
    public void remove(MenuComponent component) {
        menuComponents.remove(component);
    }

    @Override
    public MenuComponent getChild(int i) {
        return menuComponents.get(i);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void print() {
        String nameAndDescription = getName()+", "+getDescription();
        System.out.println("\n"+nameAndDescription);
        for (int i = 0; i < nameAndDescription.length(); i++) {
            System.out.print("-");
        }
        System.out.println();

        for (MenuComponent menuComponent : menuComponents) {
            menuComponent.print();
        }
    }

    @Override
    public Iterator<MenuComponent> iterator() {
        if (iterator == null) {
            iterator = new CompositeIterator(menuComponents.iterator());
        }
        return iterator;
    }
}
