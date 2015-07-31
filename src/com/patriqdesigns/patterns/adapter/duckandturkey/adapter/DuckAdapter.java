package com.patriqdesigns.patterns.adapter.duckandturkey.adapter;

import com.patriqdesigns.patterns.adapter.duckandturkey.duck.Duck;
import com.patriqdesigns.patterns.adapter.duckandturkey.turkey.Turkey;

/**
 * Created by Andre on 21/07/15.
 */
public class DuckAdapter implements Turkey{

    private Duck duck;

    public DuckAdapter(Duck duck) {
        this.duck = duck;
    }

    @Override
    public void gobble() {
        duck.quack();
    }

    @Override
    public void fly() {
        if(Math.random()*5 > 4.5){
            duck.fly();
        }
    }
}
