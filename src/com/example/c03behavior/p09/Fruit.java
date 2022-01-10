package com.example.c03behavior.p09;

import java.time.LocalDate;

public class Fruit extends Product{
    private float weight;
    public Fruit(String name, LocalDate producedDate, float price) {
        super(name, producedDate, price);
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
}
