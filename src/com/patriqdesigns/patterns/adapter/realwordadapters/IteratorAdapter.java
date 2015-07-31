package com.patriqdesigns.patterns.adapter.realwordadapters;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * Created by Andre on 21/07/15.
 */
public class IteratorAdapter<E> implements Enumeration<E> {

    private Iterator<E> iterator;

    public IteratorAdapter(Iterator<E> iterator) {
        this.iterator = iterator;
    }

    @Override
    public boolean hasMoreElements() {
        return iterator.hasNext();
    }

    @Override
    public E nextElement() {
        return iterator.next();
    }
}
