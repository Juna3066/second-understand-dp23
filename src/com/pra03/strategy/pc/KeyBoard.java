package com.pra03.strategy.pc;

public class KeyBoard implements USB{
    @Override
    public void read() {
        System.out.println("键盘指令数据...");
    }
}
