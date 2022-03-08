package com.example.c01create.p04;

public class Marine extends LowClassUnit {
    public Marine(int x, int y) {
        super(x, y);
    }

    @Override
    public void show() {
        System.out.println("士兵出现坐标[" + x + "," + y + "]");
    }

    @Override
    public void attack() {
        System.out.println("士兵机枪射击,攻击力：" + attack);
    }
}
