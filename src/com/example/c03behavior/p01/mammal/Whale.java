package com.example.c03behavior.p01.mammal;

import com.example.c03behavior.p01.mammal.Mammal;

public class Whale extends Mammal {
    @Override
    public void move() {
        System.out.println("鲸在水里飞快的游");
    }

    @Override
    public void eat() {
        System.out.println("捕鱼吃");
    }

    /*public void live() {
        move();
        eat();
    }*/
}
