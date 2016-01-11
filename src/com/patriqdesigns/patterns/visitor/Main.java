package com.patriqdesigns.patterns.visitor;

import com.patriqdesigns.patterns.visitor.elements.Book;
import com.patriqdesigns.patterns.visitor.elements.DVD;
import com.patriqdesigns.patterns.visitor.elements.ShoppingCart;
import com.patriqdesigns.patterns.visitor.visitors.ExpeditionCost;
import com.patriqdesigns.patterns.visitor.visitors.ExpeditionTime;

/**
 * Created by andre on 11/19/15.
 */
public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.getProducts().add(new Book());
        cart.getProducts().add(new Book());
        cart.getProducts().add(new DVD());
        ExpeditionCost expeditionCost = new ExpeditionCost();
        cart.accept(expeditionCost);
        System.out.println(expeditionCost.getPrice());
        ExpeditionTime expeditionTime = new ExpeditionTime();
        cart.accept(expeditionTime);
        System.out.println(expeditionTime.getTime());
    }
}
