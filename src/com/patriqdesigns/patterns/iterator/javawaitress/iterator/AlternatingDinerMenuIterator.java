package com.patriqdesigns.patterns.iterator.javawaitress.iterator;

import com.patriqdesigns.patterns.iterator.javawaitress.MenuItem;

import java.util.Calendar;
import java.util.Iterator;

/**
 * Created by Andre on 23/07/15.
 */
public class AlternatingDinerMenuIterator implements Iterator<MenuItem> {

    private MenuItem[] menuItems;
    private int position;

    public AlternatingDinerMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
        Calendar date = Calendar.getInstance();
        position = date.get(Calendar.DAY_OF_WEEK) % 2;
    }

    @Override
    public boolean hasNext() {
        return position <= menuItems.length -1 && menuItems[position] != null;
    }

    @Override
    public MenuItem next() {
        MenuItem next = menuItems[position];
        position += 2;
        return next;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Alternating diner menu" +
                " iterator does not support remove()");
    }
}
