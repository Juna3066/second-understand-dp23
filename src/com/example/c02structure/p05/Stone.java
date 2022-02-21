package com.example.c02structure.p05;

public class Stone implements Drawable{
    private String image;

    public Stone() {
        this.image = "石头";
        System.out.print("加载图片[" + this.image + "],耗时半秒...");
    }

    @Override
    public void draw(int x, int y) {
        System.out.println("坐标[" + x + "," + y + "]绘制图片[" + this.image + "]");
    }
}
