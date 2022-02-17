package com.pra01.observer;

public class Client {
    public static void main(String[] args) {
        Shop shop = new Shop();
        HandChopper h = new HandChopper("H");
        PhoneFan p = new PhoneFan("P");

        shop.register(h);
        shop.register(p);

        shop.setProduct("公爵600");
        shop.setProduct("自热锅");
        shop.setProduct("红米k40手机");
    }
}
