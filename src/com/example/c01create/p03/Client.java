package com.example.c01create.p03;

import java.util.Random;

public class Client {
    public static void main(String[] args) {
        //demo01();
        //demo02();

        demo03();
    }

    /**
     * 工厂方法模式
     * 多态后的工厂
     */
    private static void demo03() {
        System.out.println("game start");
        IFactory factory = new AirplaneFactory();
        for (int i = 0; i < 3; i++) {
            factory.create(100).show();
        }

        factory = new TankFactory();
        for (int i = 0; i < 6; i++) {
            factory.create(100).show();
        }

        System.out.println("抵达最终...");
        factory = new BossFactory();
        factory.create(100).show();
    }

    /**
     * 简单工厂
     *     对象创建进行了封装
     *     对象创建 和 客户端解耦
     */
    private static void demo02() {
        System.out.println("game start");
        SimpleFactory factory = new SimpleFactory(100);
        factory.create("airplane").show();
        factory.create("tank").show();
    }

    private static void demo01() {
        int screenWidth = 100;
        System.out.println("game start");
        Random random = new Random();
        int x = random.nextInt(screenWidth);
        Airplane airplane = new Airplane(x, 0);
        airplane.show();
        x = random.nextInt(screenWidth);
        Tank tank = new Tank(x, 0);
        tank.show();
    }
}
