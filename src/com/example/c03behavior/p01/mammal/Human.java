package com.example.c03behavior.p01.mammal;

import com.example.c03behavior.p01.mammal.Mammal;

public class Human extends Mammal {
    @Override
    public void move() {
        System.out.println("人在公路上骑自行车");
    }

    @Override
    public void eat() {
        System.out.println("饭店吃木桶饭");
    }

    /*public void live() {
        move();
        eat();
    }*/
}
