package com.pra02.strategy.usb;

public class Computer {
    //焊接接口
    private USB usb;
    //链接USB设备
    public void setUSB(USB usb){
        this.usb = usb;
    }

    public void compute(){
        usb.read();
    }
}
