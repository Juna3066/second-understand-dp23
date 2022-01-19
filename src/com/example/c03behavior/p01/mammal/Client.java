package com.example.c03behavior.p01.mammal;

public class Client {
    public static void main(String[] args) {
        Mammal m = new Human();
        m.live();
        m = new Whale();
        m.live();
        m = new Bat();
        m.live();
    }
}
