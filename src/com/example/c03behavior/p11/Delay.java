package com.example.c03behavior.p11;

public class Delay implements Expression{
    //延迟时间
    private int seconds;

    public Delay(int seconds) {
        this.seconds = seconds;
    }

    public int getSeconds() {
        return seconds;
    }

    @Override
    public void interpret() {
        System.out.println("系统延迟："+seconds+"秒");
        try {
            Thread.sleep(seconds*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
