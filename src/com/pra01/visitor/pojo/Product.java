package com.pra01.visitor.pojo;

import java.time.LocalDate;

/**
 * 商品抽象类
 */
public abstract class Product {
    private String name;
    private float price;
    private LocalDate productDate;

    public Product(String name, float price, LocalDate productDate) {
        this.name = name;
        this.price = price;
        this.productDate = productDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public LocalDate getProductDate() {
        return productDate;
    }

    public void setProductDate(LocalDate productDate) {
        this.productDate = productDate;
    }
}
