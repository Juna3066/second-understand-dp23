package com.pra02.decorator;

public class Client {
    public static void main(String[] args) {
        Showable girl = new Lipstick(new FoundationMakeup(new Girl()));
        girl.show();
    }
}
