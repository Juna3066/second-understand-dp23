package com.example.c03behavior.p10;

public class Buyer {
    private String name;
    private Shop shop;

    public Buyer(String name, Shop shop) {
        this.name = name;
        this.shop = shop;
    }

    public void buy() {
        System.out.println(String.format("[%s]购买[%s]", name, shop.getProduct()));
    }

}
