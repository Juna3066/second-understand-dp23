package com.example.c01create.p02;

/**
 * 敌机克隆工厂 方便获取实力副本
 */
public class EnemyPlaneFactory {
    private static EnemyPlane protoType = new EnemyPlane(200);

    public static EnemyPlane getInstance(int x) throws CloneNotSupportedException {
        EnemyPlane clone = null;
        clone = protoType.clone();
        clone.setX(x);
        return clone;
    }
}