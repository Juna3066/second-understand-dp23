package com.example.c02structure.p05;

public class House implements Drawable {
    private String image;

    public House() {
        this.image = "房子";
        System.out.print("加载图片[" + this.image + "],耗时半秒...");
    }

    @Override
    public void draw(int x, int y) {
        System.out.print("切换为上图层...");
        System.out.println("坐标[" + x + "," + y + "]绘制图片[" + this.image + "]");
    }
}
