package com.pra02.strategy.usb;

public class KeyBoard implements USB{
    @Override
    public void read() {
        System.out.println("键盘输入...");
    }
}
