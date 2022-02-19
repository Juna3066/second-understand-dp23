package com.pra02.template.live;

public class Whale extends Mammal{
    @Override
    public void eat() {
        System.out.println("Whale.eat");
    }

    @Override
    public void move() {
        System.out.println("Whale.move");
    }
}
