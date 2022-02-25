package com.example.c02structure.p07;

public abstract class Pen {
    //protected
    public abstract void getColor();

    public void draw(){
        getColor();
        System.out.print("三角");
    }
}
