package com.example.c03behavior.p05;

public class Switcher {
    private boolean state = false;

    public void on() {
        //如果 状态 更复杂 判断逻辑会 越来越多
        if (!this.state) {
            this.state = true;
            System.out.println("灯亮");
        } else {
            System.out.println("ERROR:灯亮,请勿重复操作");
        }
    }

    public void off() {
        if (state) {
            this.state = false;
            System.out.println("灯灭");
        } else {
            System.out.println("ERROR:灯灭,请勿重复操作");
        }
    }
}
