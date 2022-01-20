package com.pra01.template;

public class Bat extends Mammal{
    @Override
    public void eat() {
        System.out.println("吃小虫子");
    }

    @Override
    public void move() {
        System.out.println("发出超声波探测飞行");
    }
}
