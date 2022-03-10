package com.pra01.adapter;

/**
 * 对象适配器
 * 适配实现二插孔接口对象
 */
public class ObjAdapter implements TriplePin{
    private DualPin dualPin;

    public ObjAdapter(DualPin dualPin) {
        this.dualPin = dualPin;
    }

    @Override
    public void electric(int l, int n, int e) {
        this.dualPin.electric(l,n);
    }
}
