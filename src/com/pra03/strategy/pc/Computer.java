package com.pra03.strategy.pc;
//context
public class Computer {
    private USB usb;

    //setStrategy
    public void setUsb(USB usb) {
        this.usb = usb;
    }

    //execute
    public void compute() {
        this.usb.read();
    }

}
