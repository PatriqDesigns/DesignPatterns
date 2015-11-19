package com.patriqdesigns.patterns.visitor.elements;

import com.patriqdesigns.patterns.visitor.visitors.Visitor;

/**
 * Created by andre on 11/19/15.
 */
public interface Element {
    void accept(Visitor visitor);
}
