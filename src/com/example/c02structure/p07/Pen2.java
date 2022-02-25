package com.example.c02structure.p07;

public abstract class Pen2 {
    //尺子引用
    protected Ruler ruler;

    public Pen2(Ruler ruler) {
        //桥梁连接关键点
        this.ruler = ruler;
    }

    public abstract void draw();
}
