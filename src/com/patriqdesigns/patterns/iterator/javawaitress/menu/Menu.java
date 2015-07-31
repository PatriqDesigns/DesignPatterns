package com.patriqdesigns.patterns.iterator.javawaitress.menu;

import com.patriqdesigns.patterns.iterator.javawaitress.MenuItem;

import java.util.Iterator;

/**
 * Created by Andre on 23/07/15.
 */
public interface Menu {
    public MenuItem addItem(String name, String description, boolean vegetarian, double price);
    public Iterator<MenuItem> iterator();
}
