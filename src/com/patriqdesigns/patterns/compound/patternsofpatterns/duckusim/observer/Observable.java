package com.patriqdesigns.patterns.compound.patternsofpatterns.duckusim.observer;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Andre on 25/07/15.
 */
public class Observable implements QuackObservable {

    private ArrayList<QuackObserver> observers;
    private QuackObservable observable;

    public Observable(QuackObservable observable) {
        this.observable = observable;
        this.observers = new ArrayList<QuackObserver>();
    }

    public Observable() {
        this.observers = new ArrayList<QuackObserver>();
    }

    @Override
    public void registerObserver(QuackObserver observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        Iterator<QuackObserver> observerIterator = observers.iterator();
        while(observerIterator.hasNext()){
            observerIterator.next().update(observable);
        }
    }
}
