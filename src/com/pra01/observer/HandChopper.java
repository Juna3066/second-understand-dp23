package com.pra01.observer;

public class HandChopper extends Buyer {
    public HandChopper(String name) {
        super(name);
    }

    @Override
    public void inform(String product) {
        System.out.println(String.format("[%s]购买了[%s]", name, product));
    }
}
