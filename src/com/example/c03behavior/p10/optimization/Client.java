package com.example.c03behavior.p10.optimization;

import javax.crypto.Cipher;

public class Client {
    public static void main(String[] args) {
        Shop shop = new Shop();
        HandChopper cai = new HandChopper("小财");
        PhoneFans mi = new PhoneFans("小米");
        shop.register(cai);
        shop.register(mi);

        shop.setProduct("汤达人");
        shop.setProduct("荣耀10手机");
    }
}
