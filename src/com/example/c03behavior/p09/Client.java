package com.example.c03behavior.p09;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        //demo01();
        demo02();
    }

    private static void demo02() {
        //List<Product>
        List<Acceptable> productList = Arrays.asList(
                new Candy("大白兔奶糖", LocalDate.now(), 20.0f),
                new Wine("泸州老窖", LocalDate.of(2010, 01, 01), 1000.0f),
                new Fruit("草莓", LocalDate.now(), 2.5f, 2.0f)
        );

        DiscountVisitor visitor = new DiscountVisitor(LocalDate.now());
        //productList.forEach(product -> visitor.visit(product));
        for (Acceptable product : productList) {
            product.accept(visitor);
        }
    }

    private static void demo01() {
        Visitor visitor = new DiscountVisitor(LocalDate.now());
        Fruit banana = new Fruit("香蕉", LocalDate.now(), 2.5f);
        banana.setWeight(2f);
        visitor.visit(banana);

        Candy candy = new Candy("巧克力糖", LocalDate.now(), 20f);
        visitor.visit(candy);

        visitor.visit(new Wine("茅台", LocalDate.now(), 1000f));
    }
}
