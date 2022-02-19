package com.pra02.template.live;

public abstract class Mammal {
    public abstract void eat();

    public void move() {
        System.out.println("move");
    }

    public final void live() {
        move();
        eat();
    }
}
