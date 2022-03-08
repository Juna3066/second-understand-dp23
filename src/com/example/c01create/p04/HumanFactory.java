package com.example.c01create.p04;

/**
 * 名字容易打错的话、类加一个名称字段直接调用、打印结果就统一了。
 */
public class HumanFactory implements AbstractFactory {
    private int x, y;

    public HumanFactory(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public LowClassUnit createLowClass() {
        LowClassUnit unit = new Marine(x, y);

        System.out.println("制造海军陆战队队员成功。");
        return unit;
    }

    @Override
    public MidClassUnit createMidClass() {
        MidClassUnit unit = new Tank(x, y);
        System.out.println("制造变形坦克成功。");

        return unit;
    }

    @Override
    public HighClassUnit createHighClass() {
        HighClassUnit unit = new Battleship(x, y);
        System.out.println("制造巨型战舰成功。");

        return unit;
    }
}
