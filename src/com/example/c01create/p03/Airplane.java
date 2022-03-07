package com.example.c01create.p03;

public class Airplane extends Enemy{
    public Airplane(int x, int y) {
        super(x, y);
    }

    @Override
    public void show() {
        System.out.println("上图层绘制敌机,出现坐标：["+this.x+","+this.y+"]");
        System.out.println("敌机发起攻击...");
    }
}
