package com.pra02.strategy.usb;

public class Client {
    public static void main(String[] args) {
        Computer c = new Computer();
        c.setUSB(new Mouse());
        c.compute();

        c.setUSB(new KeyBoard());
        c.compute();

        c.setUSB(new Camera());
        c.compute();
    }
}
