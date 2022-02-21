package com.example.c02structure.p03;

public class Client {
    public static void main(String[] args) {
        Showable girl = new Lipstick(new FoundationMakeup(new Girl()));
        girl.show();
    }
}
