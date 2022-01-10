package com.example.c03behavior.p09;

public interface Visitor {
    void visit(Candy candy);
    void visit(Wine wine);
    void visit(Fruit fruit);
}
