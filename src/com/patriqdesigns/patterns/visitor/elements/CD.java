package com.patriqdesigns.patterns.visitor.elements;

import com.patriqdesigns.patterns.visitor.visitors.Visitor;

/**
 * Created by andre on 11/19/15.
 */
public class CD extends Product {
    @Override
    public float getCost() {
        return 1.5f;
    }

    @Override
    public float getTime() {
        return 1;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
