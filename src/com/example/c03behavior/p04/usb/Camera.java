package com.example.c03behavior.p04.usb;

public class Camera implements USB{
    @Override
    public void read() {
        System.out.println("视频流数据...");
    }
}
