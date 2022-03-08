package com.example.c01create.p04;

public class Roach extends LowClassUnit{
    public Roach(int x, int y) {
        super(x, y);
    }

    @Override
    public void show() {
        System.out.println("蟑螂兵出现坐标[" + x + "," + y + "]");
    }

    @Override
    public void attack() {
        System.out.println("蟑螂兵利爪攻击,攻击力：" + attack);
    }
}
