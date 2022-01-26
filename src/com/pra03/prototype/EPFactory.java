package com.pra03.prototype;

public class EPFactory {
    //饿汉式
    private static EnemyPlane protoType = new EnemyPlane(100);

    //工厂需要构造方法private吗 根据需要 不想让工厂实例化就加
    public static EnemyPlane getInstance(int x) throws CloneNotSupportedException {
        EnemyPlane clone = protoType.clone();
        clone.setX(x);
        System.out.printf("敌机【%s】-坐标【%s】-子弹【%s】\n", clone, clone.getX() + "," + clone.getY(), clone.getBullet());
        return clone;
    }

}
