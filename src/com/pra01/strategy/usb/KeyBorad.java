package com.pra01.strategy.usb;

public class KeyBorad implements USB {
    @Override
    public void read() {
        System.out.println("键盘操作...");
    }
}
