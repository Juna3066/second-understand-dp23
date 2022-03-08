package com.example.c01create.p04;

public class Battleship extends HighClassUnit {
    public Battleship(int x, int y) {
        super(x, y);
    }

    @Override
    public void show() {
        System.out.println("战舰出现坐标[" + x + "," + y + "]");
    }

    @Override
    public void attack() {
        System.out.println("战舰激光轰击,攻击力：" + attack);
    }
}
