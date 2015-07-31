package com.patriqdesigns.patterns.compound.patternsofpatterns.duckusim;

import com.patriqdesigns.patterns.compound.patternsofpatterns.duckusim.composite.Flock;
import com.patriqdesigns.patterns.compound.patternsofpatterns.duckusim.decorator.QuackCounter;
import com.patriqdesigns.patterns.compound.patternsofpatterns.duckusim.factory.AbstractDuckFactory;
import com.patriqdesigns.patterns.compound.patternsofpatterns.duckusim.factory.AbstractGooseFactory;

/**
 * Created by Andre on 25/07/15.
 */
public class DuckSimulator {

    public void simulate(AbstractDuckFactory duckFactory, AbstractGooseFactory gooseFactory){
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseDuck = gooseFactory.createGoose();

        Flock flockOfDucks = new Flock();
        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(gooseDuck);

        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable mallardDuck1 = duckFactory.createMallardDuck();
        Quackable mallardDuck2 = duckFactory.createMallardDuck();
        Quackable mallardDuck3 = duckFactory.createMallardDuck();

        Flock mallardFlock = new Flock();
        mallardFlock.add(mallardDuck);
        mallardFlock.add(mallardDuck1);
        mallardFlock.add(mallardDuck2);
        mallardFlock.add(mallardDuck3);

        flockOfDucks.add(mallardFlock);

        System.out.println("\nDuck simulator: with observer.");
        Quackologist quackologist = new Quackologist();
        flockOfDucks.registerObserver(quackologist);
        simulate(flockOfDucks);
        System.out.println("The ducks quacked "+ QuackCounter.getCount()+" times.");
    }

    public void simulate(Quackable quackable){
        quackable.quack();
    }
}
