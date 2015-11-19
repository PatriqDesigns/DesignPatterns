package com.patriqdesigns.patterns.visitor.visitors;

import com.patriqdesigns.patterns.visitor.elements.*;

/**
 * Created by andre on 11/19/15.
 */
public class ExpeditionTime implements Visitor {

    private float time;

    @Override
    public void visit(Book book) {
        time += book.getTime();
    }

    @Override
    public void visit(CD cd) {
        time += cd.getTime();
    }

    @Override
    public void visit(DVD dvd) {
        time += dvd.getTime();
    }

    @Override
    public void visit(ShoppingCart cart) {
        for (Product product : cart.getProducts()){
            product.accept(this);
        }
    }

    public String getTime() {
        return "Total time until arrival is "+time+" days.";
    }
}
