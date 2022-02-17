package com.example.c03behavior.p10.optimization;

public class PhoneFans extends Buyer {
    public PhoneFans(String name) {
        super(name);
    }

    @Override
    public void inform(String product) {
        if (product.contains("手机")) {
            System.out.printf("[%s]购买[%s]\n", name, product);
        }
    }
}
