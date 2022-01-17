package com.example.c03behavior.p08.bulb;

public class Switcher {
    private Bulb bulb;

    public Switcher(Bulb bulb) {
        this.bulb = bulb;
    }

    public void btnPush(){
        System.out.println("开关按下");
        bulb.on();
    }

    public void btnPop() {
        System.out.println("开关弹开");
        bulb.off();
    }

}
