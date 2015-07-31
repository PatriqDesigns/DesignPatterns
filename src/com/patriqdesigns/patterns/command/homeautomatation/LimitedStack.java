package com.patriqdesigns.patterns.command.homeautomatation;

import java.util.Stack;

/**
 * Created by Andre on 20/07/15.
 */
public class LimitedStack<E> extends Stack<E> {

    private int limit;

    public LimitedStack(int limit) {
        this.limit = limit;
    }

    @Override
    public E push(E item) {
        if(size() == limit){
            for(int i = 1; i < size(); i++){
                set(i-1, get(i));
            }
            remove(size() - 1);
        }
        return super.push(item);
    }

}
