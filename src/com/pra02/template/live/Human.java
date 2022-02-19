package com.pra02.template.live;

public class Human extends Mammal {

    @Override
    public void eat() {
        System.out.println("Human.eat");
    }

    @Override
    public void move() {
        System.out.println("Human.move");
    }
}
