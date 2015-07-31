package com.patriqdesigns.patterns.iterator.javawaitress.iterator;

import com.patriqdesigns.patterns.iterator.javawaitress.MenuItem;

import java.util.Iterator;

/**
 * Created by Andre on 23/07/15.
 */
public class DinerMenuIterator implements Iterator<MenuItem> {

    private MenuItem[] items;
    private int next;

    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return next <= items.length-1 && items[next] != null;
    }

    @Override
    public MenuItem next() {
        return items[next++];
    }

    @Override
    public void remove() {
        if(next <= 0){
            System.out.println("Please use next() once to remove.");
        }
        throw new UnsupportedOperationException();
    }
}
