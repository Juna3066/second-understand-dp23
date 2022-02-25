package com.example.c02structure.p07;

public class Client {
    public static void main(String[] args) {
        //不管多少颜色的画笔 只能化不同颜色的三角  三角和笔捆绑了 丧失了可扩展性。
        //demo01();
        //桥接模式 任意【组装】 颜色 和 形状 笛卡尔积原本需要n*m个类 现在只需要n+m组合即可
        demo02();
    }

    private static void demo02() {
        new WhitePen2(new SquareRuler()).draw();
        new WhitePen2(new CircleRuler()).draw();
        new WhitePen2(new TriangleRuler()).draw();

        new BlackPen2(new SquareRuler()).draw();
        new BlackPen2(new CircleRuler()).draw();
        new BlackPen2(new TriangleRuler()).draw();
    }

    private static void demo01() {
        Pen blackPen = new BlackPen();
        blackPen.draw();
    }
}
