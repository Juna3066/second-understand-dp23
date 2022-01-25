package com.pra03.singleton;

public class Client {
    public static void main(String[] args) {
//        demo01();
        demo02();
    }

    private static void demo02() {
        Sun2 sun = Sun2.getInstance();
        Sun2 sun2 = Sun2.getInstance();
        System.out.println("太阳系只有一个太阳："+(sun==sun2));
    }

    /**
     * 饿汉式
     */
    private static void demo01() {
        Sun sun = Sun.getInstance();
        Sun sun2 = Sun.getInstance();
        System.out.println("太阳系只有一个太阳："+(sun==sun2));
    }
}
