package com.patriqdesigns.patterns.compound.patternsofpatterns.duckusim.factory;

import com.patriqdesigns.patterns.compound.patternsofpatterns.duckusim.Quackable;
import com.patriqdesigns.patterns.compound.patternsofpatterns.duckusim.duck.DuckCall;
import com.patriqdesigns.patterns.compound.patternsofpatterns.duckusim.duck.MallardDuck;
import com.patriqdesigns.patterns.compound.patternsofpatterns.duckusim.duck.RedheadDuck;
import com.patriqdesigns.patterns.compound.patternsofpatterns.duckusim.duck.RubberDuck;

/**
 * Created by Andre on 25/07/15.
 */
public class DuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable createMallardDuck() {
        return new MallardDuck();
    }

    @Override
    public Quackable createRedheadDuck() {
        return new RedheadDuck();
    }

    @Override
    public Quackable createDuckCall() {
        return new DuckCall();
    }

    @Override
    public Quackable createRubberDuck() {
        return new RubberDuck();
    }
}
