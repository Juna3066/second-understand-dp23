package com.example.c02structure.p04.obj;

//类适配器
public class Adapter implements TriplePin {
    private DualPin pin;

    //创建适配器时 根据需求写 此处根据个人需求 要求 接入二插口设备
    public Adapter(DualPin pin) {
        this.pin = pin;
    }

    @Override
    public void electrify(int l, int n, int e) {
        this.pin.electrify(l, n);
    }
}
