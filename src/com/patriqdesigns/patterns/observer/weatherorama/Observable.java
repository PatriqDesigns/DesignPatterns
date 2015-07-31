package com.patriqdesigns.patterns.observer.weatherorama;

/**
 * Created by Andre on 15/07/15.
 */
public interface Observable {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers();
}
