package com.example.c03behavior.p04.usb;

public class KeyBoard implements USB{
    @Override
    public void read() {
        System.out.println("键盘指令数据...");
    }
}
