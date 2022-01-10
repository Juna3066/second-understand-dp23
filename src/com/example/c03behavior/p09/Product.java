package com.example.c03behavior.p09;

import java.time.LocalDate;
import java.util.Date;

public abstract class Product {
    private String name;
    private LocalDate producedDate;
    private float price;

    public Product(String name, LocalDate producedDate, float price) {
        this.name = name;
        this.producedDate = producedDate;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getProducedDate() {
        return producedDate;
    }

    public void setProducedDate(LocalDate producedDate) {
        this.producedDate = producedDate;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
