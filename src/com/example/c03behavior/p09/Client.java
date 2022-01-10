package com.example.c03behavior.p09;

import java.time.LocalDate;
import java.util.Date;

public class Client {
    public static void main(String[] args) {
        Visitor visitor = new DiscountVisitor(LocalDate.now());
        Fruit banana = new Fruit("香蕉", LocalDate.now(), 2.5f);
        banana.setWeight(2f);
        visitor.visit(banana);

        Candy candy = new Candy("巧克力糖", LocalDate.now(), 20f);
        visitor.visit(candy);

        visitor.visit(new Wine("茅台",LocalDate.now(),1000f));

    }
}
