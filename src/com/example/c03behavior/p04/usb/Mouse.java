package com.example.c03behavior.p04.usb;

public class Mouse implements USB{
    @Override
    public void read() {
        System.out.println("鼠标指令数据...");
    }
}
