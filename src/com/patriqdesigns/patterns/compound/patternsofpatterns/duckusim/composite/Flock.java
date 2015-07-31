package com.patriqdesigns.patterns.compound.patternsofpatterns.duckusim.composite;

import com.patriqdesigns.patterns.compound.patternsofpatterns.duckusim.Quackable;
import com.patriqdesigns.patterns.compound.patternsofpatterns.duckusim.observer.QuackObserver;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Andre on 25/07/15.
 */
public class Flock implements Quackable {

    private ArrayList<Quackable> quackables;

    public Flock() {
        quackables = new ArrayList<Quackable>();
    }

    public void add(Quackable quackable){
        quackables.add(quackable);
    }

    @Override
    public void quack() {
        Iterator<Quackable> iterator = quackables.iterator();
        while(iterator.hasNext()){
            iterator.next().quack();
        }
    }

    @Override
    public void registerObserver(QuackObserver observer) {
        Iterator<Quackable> quackableIterator = quackables.iterator();
        while(quackableIterator.hasNext()){
            quackableIterator.next().registerObserver(observer);
        }
    }

    @Override
    public void notifyObservers() {
        Iterator<Quackable> quackableIterator = quackables.iterator();
        while(quackableIterator.hasNext()){
            quackableIterator.next().notifyObservers();
        }
    }
}
