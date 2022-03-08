package com.example.c01create.p04;

public class Mammoth extends HighClassUnit {
    public Mammoth(int x, int y) {
        super(x, y);
    }

    @Override
    public void show() {
        System.out.println("猛犸巨兽出现坐标[" + x + "," + y + "]");
    }

    @Override
    public void attack() {
        System.out.println("猛犸巨兽爆裂冲击,攻击力：" + attack);
    }
}
