package com.patriqdesigns.patterns.visitor.visitors;

import com.patriqdesigns.patterns.visitor.elements.Book;
import com.patriqdesigns.patterns.visitor.elements.CD;
import com.patriqdesigns.patterns.visitor.elements.DVD;
import com.patriqdesigns.patterns.visitor.elements.ShoppingCart;

/**
 * Created by andre on 11/19/15.
 */
public interface Visitor {
    void visit(Book book);

    void visit(CD cd);

    void visit(DVD dvd);

    void visit(ShoppingCart cart);
}
