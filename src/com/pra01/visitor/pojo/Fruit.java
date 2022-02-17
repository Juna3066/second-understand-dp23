package com.pra01.visitor.pojo;

import com.pra01.visitor.Acceptable;
import com.pra01.visitor.Visitor;

import java.time.LocalDate;

public class Fruit extends Product implements Acceptable {
    private float weight;

    public Fruit(String name, float price, LocalDate productDate) {
        super(name, price, productDate);
    }

    public Fruit(String name, float price, LocalDate productDate, float weight) {
        super(name, price, productDate);
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
