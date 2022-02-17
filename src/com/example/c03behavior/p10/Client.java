package com.example.c03behavior.p10;

public class Client {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Buyer ming = new Buyer("小名",shop);
        Buyer li = new Buyer("小力", shop);
        Buyer da = new Buyer("小答", shop);

        ming.buy();
        li.buy();
        ming.buy();

        shop.setProduct("公爵600");
        da.buy();
        li.buy();
    }
}
