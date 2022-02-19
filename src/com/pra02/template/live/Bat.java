package com.pra02.template.live;

public class Bat extends Mammal{

    @Override
    public void eat() {
        System.out.println("Bat.eat");
    }

    @Override
    public void move() {
        System.out.println("Bat.move");
    }
}
