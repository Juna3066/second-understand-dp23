package com.example.c01create.p03;

public class Boss extends Enemy {

    public Boss(int x, int y) {
        super(x, y);
    }

    @Override
    public void show() {
        System.out.println("Boss出现,坐标[" + this.x + "," + this.y + "]");
        System.out.println("Boss发起攻击");
    }
}
