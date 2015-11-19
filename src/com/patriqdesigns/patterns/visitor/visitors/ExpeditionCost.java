package com.patriqdesigns.patterns.visitor.visitors;

import com.patriqdesigns.patterns.visitor.elements.*;

/**
 * Created by andre on 11/19/15.
 */
public class ExpeditionCost implements Visitor {

    private float price;

    @Override
    public void visit(Book book) {
        price += book.getCost();
    }

    @Override
    public void visit(CD cd) {
        price += cd.getCost();
    }

    @Override
    public void visit(DVD dvd) {
        // DVD are in discount
        price += dvd.getCost() * 0.9;
    }

    @Override
    public void visit(ShoppingCart cart) {
        for (Product product : cart.getProducts()) {
            product.accept(this);
        }
    }

    public String getPrice() {
        return "The total price is " + price + " euros.";
    }
}
