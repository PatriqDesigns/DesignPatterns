package com.patriqdesigns.patterns.composite.javawaitress.composite.iterator;

import com.patriqdesigns.patterns.composite.javawaitress.composite.Menu;
import com.patriqdesigns.patterns.composite.javawaitress.composite.MenuComponent;

import java.util.Iterator;
import java.util.Stack;

/**
 * Created by Andre on 23/07/15.
 */
public class CompositeIterator implements Iterator<MenuComponent> {

    private Stack<Iterator<MenuComponent>> stack;

    public CompositeIterator(Iterator<MenuComponent> iterator) {
        stack = new Stack<Iterator<MenuComponent>>();
        stack.push(iterator);
    }

    @Override
    public boolean hasNext() {
        if(!stack.empty()){
            Iterator<MenuComponent> iterator = stack.peek();
            if(!iterator.hasNext()){
                stack.pop();
                return hasNext();
            }
            return true;
        }
        return false;
    }

    @Override
    public MenuComponent next() {
        if(hasNext()){
            Iterator<MenuComponent> iterator = stack.peek();
            MenuComponent component = iterator.next();
            if(component instanceof Menu){
                stack.push(component.iterator());
            }
            return component;
        }
        return null;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
