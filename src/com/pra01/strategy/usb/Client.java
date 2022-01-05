package com.pra01.strategy.usb;

public class Client {
    public static void main(String[] args) {
        //创建主体
        Computer c = new Computer();
        //注入策略 各种各样需要的策略
        c.setUSB(new Camera());
        c.computed();

        c.setUSB(new Mouse());
        c.computed();

        c.setUSB(new KeyBorad());
        c.computed();
    }
}
