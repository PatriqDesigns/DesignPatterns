package com.patriqdesigns.patterns.compound.patternsofpatterns.duckusim;

import com.patriqdesigns.patterns.compound.patternsofpatterns.duckusim.factory.CountingDuckFactory;
import com.patriqdesigns.patterns.compound.patternsofpatterns.duckusim.factory.QuackableGooseFactory;

/**
 * Created by Andre on 25/07/15.
 */
public class Main {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        simulator.simulate(new CountingDuckFactory(), new QuackableGooseFactory());
    }
}
