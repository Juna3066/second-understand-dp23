package com.example.c02structure.p05;

public class Client {
    public static void main(String[] args) {
        //demo01();
        demo02();
    }

    private static void demo02() {
        TileFactory factory = new TileFactory();
        factory.getDrawable("河流").draw(10,10);
        factory.getDrawable("河流").draw(10,20);
        factory.getDrawable("石头").draw(10,30);
        factory.getDrawable("草").draw(10,40);
        factory.getDrawable("草").draw(10,50);
        factory.getDrawable("草").draw(10,60);
        factory.getDrawable("草").draw(10,70);
        factory.getDrawable("草").draw(10,80);
        factory.getDrawable("石头").draw(10,90);
        factory.getDrawable("石头").draw(10,100);
        factory.getDrawable("房子").draw(10,50);
        factory.getDrawable("房子").draw(10,70);
    }

    /**
     * 10张图片 加载5秒 整个地图 耗费更多时间 用户体验性极差
     * 同时 tile对象群 内存开销极大，如果没有内存回收机制，可能会造成内存溢出，甚至系统崩溃
     */
    private static void demo01() {
        new Tile("河流",10,10).draw();
        new Tile("河流",10,20).draw();
        new Tile("道路",10,30).draw();
        new Tile("草地",10,40).draw();
        new Tile("草地",10,50).draw();
        new Tile("草地",10,60).draw();
        new Tile("草地",10,70).draw();
        new Tile("草地",10,80).draw();
        new Tile("道路",10,90).draw();
        new Tile("道路",10,10).draw();
    }
}
