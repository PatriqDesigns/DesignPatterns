package com.patriqdesigns.patterns.compound.patternsofpatterns.duckusim.duck;

import com.patriqdesigns.patterns.compound.patternsofpatterns.duckusim.Quackable;
import com.patriqdesigns.patterns.compound.patternsofpatterns.duckusim.observer.Observable;
import com.patriqdesigns.patterns.compound.patternsofpatterns.duckusim.observer.QuackObserver;

/**
 * Created by Andre on 25/07/15.
 */
public class DuckCall implements Quackable {

    private Observable observable;

    public DuckCall() {
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Kwak");
        notifyObservers();
    }

    @Override
    public void registerObserver(QuackObserver observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }

    @Override
    public String toString() {
        return "Duck Call";
    }
}
