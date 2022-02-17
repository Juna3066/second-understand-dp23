package com.example.c03behavior.p10.optimization;

public class HandChopper extends Buyer {
    public HandChopper(String name) {
        super(name);
    }

    @Override
    public void inform(String product) {
        System.out.printf("[%s]购买[%s]\n", name, product);
    }
}
