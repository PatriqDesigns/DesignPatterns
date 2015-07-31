package com.patriqdesigns.patterns.compound.patternsofpatterns.duckusim.factory;

import com.patriqdesigns.patterns.compound.patternsofpatterns.duckusim.Quackable;

/**
 * Created by Andre on 25/07/15.
 */
public abstract class AbstractDuckFactory {
    public abstract Quackable createMallardDuck();
    public abstract Quackable createRedheadDuck();
    public abstract Quackable createDuckCall();
    public abstract Quackable createRubberDuck();
}
