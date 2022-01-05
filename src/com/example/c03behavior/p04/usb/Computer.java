package com.example.c03behavior.p04.usb;

/**
 * USE接口策略 接驳 到 计算器
 */
public class Computer {
    //主机上USB接口
    private USB usb;

    //插入U盘
    public void setUSB(USB usb) {
        this.usb = usb;
    }

    public void compute() {
        usb.read();
    }
}
