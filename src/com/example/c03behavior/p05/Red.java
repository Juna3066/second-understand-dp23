package com.example.c03behavior.p05;

public class Red implements State {
    @Override
    public void toGreen(NewTrafficLight light) {
        System.out.println("Error：需要黄灯过度");
    }

    @Override
    public void toYellow(NewTrafficLight light) {
        light.setState(new Yellow());
        System.out.println("黄灯亮5秒");
    }

    @Override
    public void toRed(NewTrafficLight light) {
        System.out.println("Error：需要黄灯过度");
    }
}
