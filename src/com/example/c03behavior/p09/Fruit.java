package com.example.c03behavior.p09;

import java.time.LocalDate;

public class Fruit extends Product implements Acceptable{
    private float weight;
    public Fruit(String name, LocalDate producedDate, float price) {
        super(name, producedDate, price);
    }

    public Fruit(String name, LocalDate producedDate, float price, float weight) {
        super(name, producedDate, price);
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
