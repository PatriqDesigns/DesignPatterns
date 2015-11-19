package com.patriqdesigns.patterns.visitor.elements;

import com.patriqdesigns.patterns.visitor.visitors.Visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by andre on 11/19/15.
 */
public class ShoppingCart implements Element {
    private List<Product> products;

    public ShoppingCart() {
        this.products = new ArrayList<>();
    }

    public List<Product> getProducts() {
        return products;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
