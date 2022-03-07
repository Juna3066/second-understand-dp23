package com.example.c01create.p03;

public abstract class Enemy {
    protected int x,y;

    public Enemy(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * 绘制
     */
    public abstract void show();
}
