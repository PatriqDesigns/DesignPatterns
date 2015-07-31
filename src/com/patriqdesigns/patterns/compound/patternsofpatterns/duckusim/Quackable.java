package com.patriqdesigns.patterns.compound.patternsofpatterns.duckusim;

import com.patriqdesigns.patterns.compound.patternsofpatterns.duckusim.observer.QuackObservable;

/**
 * Created by Andre on 25/07/15.
 */
public interface Quackable extends QuackObservable {
    public void quack();
}
