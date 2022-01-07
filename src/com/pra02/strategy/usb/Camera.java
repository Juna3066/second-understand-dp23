package com.pra02.strategy.usb;

public class Camera implements USB{
    @Override
    public void read() {
        System.out.println("视频流数据...");
    }
}
