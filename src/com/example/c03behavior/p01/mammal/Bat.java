package com.example.c03behavior.p01.mammal;

import com.example.c03behavior.p01.mammal.Mammal;

public class Bat extends Mammal {
    @Override
    public void move() {
        System.out.println("蝙蝠在空中飞");
    }

    @Override
    public void eat() {
        System.out.println("抓小虫吃");
    }
}
