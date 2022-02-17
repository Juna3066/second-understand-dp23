package com.example.c03behavior.p10;

import com.pra01.visitor.pojo.Product;

public class Shop {
    private String product;

    public Shop() {
        this.product = "无商品";
    }

    //出货
    public String getProduct() {
        String p = product;
        product = "无商品";
        return p;
    }

    //进货
    public void setProduct(String product) {
        this.product = product;
    }
}
