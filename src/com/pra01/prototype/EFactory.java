package com.pra01.prototype;

public class EFactory {
    private static EnemyPlane prototype = new EnemyPlane(0);

    public static EnemyPlane getInstance(int x) throws CloneNotSupportedException {
        EnemyPlane clone = null;
        clone = prototype.clone();
        clone.setX(x);
        return clone;
    }
}
