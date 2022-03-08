package com.example.c01create.p04;

public class Poison extends MidClassUnit{
    public Poison(int x, int y) {
        super(x, y);
    }

    @Override
    public void show() {
        System.out.println("毒液兵出现坐标[" + x + "," + y + "]");
    }

    @Override
    public void attack() {
        System.out.println("毒液兵生化攻击,攻击力：" + attack);
    }
}
