package com.patriqdesigns.patterns.composite.javawaitress.composite.iterator;

import com.patriqdesigns.patterns.composite.javawaitress.composite.MenuComponent;

import java.util.Iterator;

/**
 * Created by Andre on 23/07/15.
 */
public class NullIterator implements Iterator<MenuComponent> {
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public MenuComponent next() {
        return null;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
