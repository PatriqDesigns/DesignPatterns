package com.patriqdesigns.patterns.adapter.duckandturkey.adapter;

import com.patriqdesigns.patterns.adapter.duckandturkey.duck.Duck;
import com.patriqdesigns.patterns.adapter.duckandturkey.turkey.Turkey;

/**
 * Created by Andre on 21/07/15.
 */
public class TurkeyAdapter implements Duck {

    private Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}
