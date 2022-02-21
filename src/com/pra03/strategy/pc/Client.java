package com.pra03.strategy.pc;

public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.setUsb(new Mouse());
        computer.compute();
        computer.setUsb(new KeyBoard());
        computer.compute();
        computer.setUsb(new Camera());
        computer.compute();
    }
}
