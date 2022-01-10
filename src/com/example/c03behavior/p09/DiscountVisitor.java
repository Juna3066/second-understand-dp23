package com.example.c03behavior.p09;

import java.text.NumberFormat;
import java.time.LocalDate;

public class DiscountVisitor implements Visitor {
    private LocalDate billDate;

    public DiscountVisitor(LocalDate billDate) {
        this.billDate = billDate;
        System.out.println("billDate is " + billDate);
    }

    @Override
    public void visit(Candy candy) {
        System.out.printf("=====糖果【%s】打折后价格=====\n", candy.getName());
        float rate = 0;
        long day = LocalDate.now().toEpochDay() - candy.getProducedDate().toEpochDay();
        if (day > 180) {
            System.out.println("时间超过半年，勿食用");
        } else {
            rate = 0.9f;
        }

        System.out.println(NumberFormat.getCurrencyInstance().format(rate * candy.getPrice()));
    }

    @Override
    public void visit(Wine wine) {
        System.out.println("=====酒【"+wine.getName()+"】无折扣价格=====");
        System.out.println(NumberFormat.getCurrencyInstance().format(wine.getPrice()));
    }

    @Override
    public void visit(Fruit fruit) {
        System.out.printf("=====水果【%s】打折后价格=====\n", fruit.getName());
        float rate = 0;
        long day = billDate.toEpochDay() - fruit.getProducedDate().toEpochDay();
        if (day > 7) {
            System.out.println("（￥0）存放时间大于7天，请勿使用");
        } else if (day > 3) {
            rate = 0.5f;
        } else {
            rate = 1f;
        }
        float discoutPrice = fruit.getWeight() * fruit.getPrice() * rate;
        System.out.println(NumberFormat.getCurrencyInstance().format(discoutPrice));
    }
}
