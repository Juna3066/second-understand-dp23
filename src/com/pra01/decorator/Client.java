package com.pra01.decorator;

public class Client {
    public static void main(String[] args) {
        Showable makeUpGirl = new Lipstick(new FoundationMakeup(new Girl()));
        makeUpGirl.show();
    }
}
