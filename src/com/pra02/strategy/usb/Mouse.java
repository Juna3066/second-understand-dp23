package com.pra02.strategy.usb;

public class Mouse implements USB{
    @Override
    public void read() {
        System.out.println("鼠标指令...");
    }
}
