package com.pra03.strategy.pc;

public class Mouse implements USB{
    @Override
    public void read() {
        System.out.println("鼠标指令集...");
    }
}
