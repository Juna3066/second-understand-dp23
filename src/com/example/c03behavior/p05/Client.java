package com.example.c03behavior.p05;

public class Client {
    public static void main(String[] args) {
        //demo01();
        demo02();
    }

    private static void demo02() {
        NewTrafficLight light = new NewTrafficLight();
        light.toYellow();
        light.toRed();
        light.toGreen();
        light.toYellow();
        light.toGreen();
        light.toGreen();
    }

    private static void demo01() {
        Switcher switcher = new Switcher();
        switcher.on();
        switcher.on();
        switcher.off();
        switcher.off();

    }
}
