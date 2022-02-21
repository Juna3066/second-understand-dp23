package com.pra03.strategy.pc;

public class Camera implements USB{
    @Override
    public void read() {
        System.out.println("视频流数据...");
    }
}
