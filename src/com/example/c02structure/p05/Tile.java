package com.example.c02structure.p05;

public class Tile {
    private String image;
    private int x, y;

    public Tile(String image, int x, int y) {
        this.image = image;
        System.out.print("加载图片[" + image + "],耗时半秒...");
        this.x = x;
        this.y = y;
    }

    public void draw() {
        System.out.println("坐标[" + this.x + "," + this.y + "]绘制图片[" + this.image + "]");
    }
}
