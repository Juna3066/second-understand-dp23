package com.pra01.strategy.usb;

public class Computer {
    private USB usb;

    public void setUSB(USB usb){
        this.usb = usb;
    }

    public void computed(){
        usb.read();
    }
}
