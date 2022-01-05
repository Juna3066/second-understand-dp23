package com.pra01.strategy.usb;

public class Mouse implements USB{

    @Override
    public void read() {
        System.out.println("鼠标操作...");
    }
}
