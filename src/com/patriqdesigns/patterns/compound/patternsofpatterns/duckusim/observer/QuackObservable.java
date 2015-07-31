package com.patriqdesigns.patterns.compound.patternsofpatterns.duckusim.observer;

/**
 * Created by Andre on 25/07/15.
 */
public interface QuackObservable {
    public void registerObserver(QuackObserver observer);
    public void notifyObservers();
}
