package com.pra01.visitor;

import com.pra01.visitor.pojo.Bike;
import com.pra01.visitor.pojo.Fruit;
import com.pra01.visitor.pojo.Wine;

import java.text.NumberFormat;
import java.time.LocalDate;

public class DiscountVisitor implements Visitor {
    private LocalDate visitDate;

    public DiscountVisitor(LocalDate visitDate) {
        this.visitDate = visitDate;
        System.out.println("消费日期：" + visitDate);
    }

    @Override
    public void visit(Bike bike) {
        //隐私类型转化
        float rate = 1;
        long diff = LocalDate.now().toEpochDay() - bike.getProductDate().toEpochDay();
        if (diff > 360) {
            rate = 0.8f;
        } else if (diff > 180) {
            rate = 0.9f;
        }
        System.out.printf("【%s】折后价格%s\n", bike.getName(), NumberFormat.getCurrencyInstance().format(bike.getPrice() * rate));
    }

    @Override
    public void visit(Fruit fruit) {
        float rate = 1;
        long diff = LocalDate.now().toEpochDay() - fruit.getProductDate().toEpochDay();
        if (diff > 7) {
            rate = 0;
            System.out.println("超过7天，勿食用");
        } else if (diff > 3) {
            rate = 0.5f;
        }
        System.out.printf("【%s】扣价格%s\n", fruit.getName(), NumberFormat.getCurrencyInstance().format(fruit.getPrice() * rate * fruit.getWeight()));
    }

    @Override
    public void visit(Wine wine) {
        float rate = 1;
        long diff = LocalDate.now().toEpochDay() - wine.getProductDate().toEpochDay();
        rate += (diff / 360) * 0.5;
        System.out.printf("【%s】无折扣价格%s\n", wine.getName(), NumberFormat.getCurrencyInstance().format(wine.getPrice() * rate));
    }
}
