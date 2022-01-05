package com.example.c03behavior.p04.usb;

public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.setUSB(new KeyBoard());
        computer.compute();
        computer.setUSB(new Mouse());
        computer.compute();
        computer.setUSB(new Camera());
        computer.compute();
    }
}
