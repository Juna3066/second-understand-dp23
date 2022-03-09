package com.example.c03behavior.p11;

public class Move implements Expression{
    private int x,y;

    public Move(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void interpret() {
        System.out.printf("鼠标移动：【%d,%d】\n",x,y);
    }
}
