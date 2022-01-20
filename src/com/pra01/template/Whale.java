package com.pra01.template;

public class Whale extends Mammal{
    @Override
    public void eat() {
        System.out.println("大鲸吃小鱼");
    }

    @Override
    public void move() {
        System.out.println("极速飞游");
    }
}
