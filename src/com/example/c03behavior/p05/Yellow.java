package com.example.c03behavior.p05;

public class Yellow implements State {
    @Override
    public void toGreen(NewTrafficLight light) {
        light.setState(new Green());
        System.out.println("绿灯亮60秒");
    }

    @Override
    public void toYellow(NewTrafficLight light) {
        System.out.println("Error:当前状态 是 将要 切换的状态,该操作不允许");
    }

    @Override
    public void toRed(NewTrafficLight light) {
        light.setState(new Red());
        System.out.println("红灯亮45秒");
    }
}
