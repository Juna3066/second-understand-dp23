package com.pra01.strategy.usb;

public class Camera implements USB{
    @Override
    public void read() {
        System.out.println("摄像头运行...");
    }
}
