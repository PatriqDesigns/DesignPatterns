package com.patriqdesigns.patterns.compound.patternsofpatterns.duckusim.factory;

import com.patriqdesigns.patterns.compound.patternsofpatterns.duckusim.Quackable;
import com.patriqdesigns.patterns.compound.patternsofpatterns.duckusim.adaptor.GooseAdapter;
import com.patriqdesigns.patterns.compound.patternsofpatterns.duckusim.goose.Goose;

/**
 * Created by Andre on 25/07/15.
 */
public class QuackableGooseFactory extends AbstractGooseFactory {
    @Override
    public Quackable createGoose() {
        return new GooseAdapter(new Goose());
    }
}
