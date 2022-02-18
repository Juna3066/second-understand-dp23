package com.example.c03behavior.p05;

/**
 * 之前的 切换逻辑，if else 都不存在了
 */
public class Green implements State {
    @Override
    public void toGreen(NewTrafficLight light) {
        System.out.println("Error:当前状态 是 将要 切换的状态,该操作不允许");
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
