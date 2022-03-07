package com.example.c01create.p03;

public class Tank extends Enemy{
    public Tank(int x, int y) {
        super(x, y);
    }

    @Override
    public void show() {
        System.out.println("下图层绘制敌坦克,出现坐标：["+this.x+","+this.y+"]");
        System.out.println("敌坦克发起攻击...");
    }
}
