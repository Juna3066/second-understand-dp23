package com.pra01.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建多个类似的复杂对象，考虑使用 原型模式
 * 此处例子 时间，用了原型 反而耗费更多，可能由于创建的对象比较简单
 *
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
//        long s = System.currentTimeMillis();
//        demo01();
//        demo02();
//        demo03();
//        long e = System.currentTimeMillis();
//        System.out.println(String.format("run time [%d] ms",e-s));
        demo0();
    }

    private static void demo0() throws CloneNotSupportedException {
        EnemyPlane proto = new EnemyPlane(2);
        EnemyPlane clone = proto.clone();
        System.out.println(proto.getBullet().equals(clone.getBullet()));
    }

    private static void demo03() throws CloneNotSupportedException {
        for (int i = 0; i < 10; i++) {
            EnemyPlane enemyPlane = EFactory.getInstance(i);
            enemyPlane.setX(i);
            System.out.println(enemyPlane);
        }
    }

    private static void demo02() throws CloneNotSupportedException {
        EnemyPlane protoPlane = new EnemyPlane(0);
        for (int i = 0; i < 10; i++) {
            EnemyPlane clone = protoPlane.clone();
            clone.setX(i);
            System.out.println(clone);
        }
    }

    private static void demo01() {
        List<EnemyPlane> enemyPlanes = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            System.out.println(new EnemyPlane(i));
        }
    }
}
