package com.patriqdesigns.patterns.compound.patternsofpatterns.duckusim.decorator;

import com.patriqdesigns.patterns.compound.patternsofpatterns.duckusim.Quackable;
import com.patriqdesigns.patterns.compound.patternsofpatterns.duckusim.observer.QuackObserver;

/**
 * Created by Andre on 25/07/15.
 */
public class QuackCounter implements Quackable {

    private Quackable quackable;
    private static int count;

    public QuackCounter(Quackable quackable) {
        this.quackable = quackable;
    }

    @Override
    public void quack() {
        quackable.quack();
        count++;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public void registerObserver(QuackObserver observer) {
        quackable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        quackable.notifyObservers();
    }
}
