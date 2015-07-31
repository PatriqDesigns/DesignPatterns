package com.patriqdesigns.patterns.compound.patternsofpatterns.duckusim.factory;

import com.patriqdesigns.patterns.compound.patternsofpatterns.duckusim.decorator.QuackCounter;
import com.patriqdesigns.patterns.compound.patternsofpatterns.duckusim.Quackable;
import com.patriqdesigns.patterns.compound.patternsofpatterns.duckusim.duck.DuckCall;
import com.patriqdesigns.patterns.compound.patternsofpatterns.duckusim.duck.MallardDuck;
import com.patriqdesigns.patterns.compound.patternsofpatterns.duckusim.duck.RedheadDuck;
import com.patriqdesigns.patterns.compound.patternsofpatterns.duckusim.duck.RubberDuck;

/**
 * Created by Andre on 25/07/15.
 */
public class CountingDuckFactory extends AbstractDuckFactory{
    @Override
    public Quackable createMallardDuck() {
        return new QuackCounter(new MallardDuck());
    }

    @Override
    public Quackable createRedheadDuck() {
        return new QuackCounter(new RedheadDuck());
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackCounter(new DuckCall());
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCounter(new RubberDuck());
    }
}
