package com.pra01.visitor;


import com.pra01.visitor.pojo.Bike;
import com.pra01.visitor.pojo.Fruit;
import com.pra01.visitor.pojo.Product;
import com.pra01.visitor.pojo.Wine;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Visitor visitor = new DiscountVisitor(LocalDate.now());
        Bike bike = new Bike("公爵600", 2799.0f, LocalDate.of(2021, 11, 11));
        Fruit fruit = new Fruit("苹果", 5.0f, LocalDate.of(2022, 2, 15), 2.5f);
        Wine wine = new Wine("茅台", 700, LocalDate.of(2020, 11, 11));

        visitor.visit(bike);
        visitor.visit(fruit);
        visitor.visit(wine);

        //无法识别
//        List<Product> productList = Arrays.asList(bike, fruit, wine);
//        for (Product product : productList) {
//            visitor.visit(product);
//        }

        //使用双派发
        List<Acceptable> productList = Arrays.asList(bike, fruit, wine);
        for (Acceptable product : productList) {
            product.accept(visitor);
        }

    }
}
