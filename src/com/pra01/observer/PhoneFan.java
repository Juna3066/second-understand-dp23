package com.pra01.observer;

public class PhoneFan extends Buyer{
    public PhoneFan(String name) {
        super(name);
    }

    @Override
    public void inform(String product) {
        if (product.contains("手机")){
            System.out.println(String.format("[%s]购买了[%s]", name, product));
        }
    }
}
