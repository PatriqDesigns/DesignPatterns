package com.patriqdesigns.patterns.adapter.realwordadapters;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * Created by Andre on 21/07/15.
 */
public class EnumerationAdapter<E> implements Iterator<E> {

    private Enumeration<E> enumeration;

    public EnumerationAdapter(Enumeration<E> enumeration) {
        this.enumeration = enumeration;
    }

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public E next() {
        return enumeration.nextElement();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
