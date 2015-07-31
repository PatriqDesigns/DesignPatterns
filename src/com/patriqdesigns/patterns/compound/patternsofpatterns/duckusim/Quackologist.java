package com.patriqdesigns.patterns.compound.patternsofpatterns.duckusim;

import com.patriqdesigns.patterns.compound.patternsofpatterns.duckusim.observer.QuackObservable;
import com.patriqdesigns.patterns.compound.patternsofpatterns.duckusim.observer.QuackObserver;

/**
 * Created by Andre on 25/07/15.
 */
public class Quackologist implements QuackObserver {
    @Override
    public void update(QuackObservable duck) {
        System.out.println("Quackologist: "+duck+" just quacked.");
    }
}
