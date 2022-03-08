package com.example.c01create.p04;

public class Tank extends MidClassUnit {
    public Tank(int x, int y) {
        super(x, y);
    }

    @Override
    public void show() {
        System.out.println("坦克出现坐标[" + x + "," + y + "]");
    }

    @Override
    public void attack() {
        System.out.println("坦克炮轰,攻击力：" + attack);
    }
}
