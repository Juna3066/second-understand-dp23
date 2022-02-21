package com.example.c02structure.p04.cla;

/**
 * 类适配器
 * 专属适配器 专属某个类 写法更简单
 * 由于继承 在类定义的时候 适配器就有电视 完成了接驳（或者说是继承耦合），
 *
 * 如果在来二叉洗衣机还要再写一个 适配器 代码冗余 同时兼容性差 但是并没有绝对，根据需求去选择。
 */
public class TVAdapter extends TV implements TriplePin {

    @Override
    public void electrify(int l, int n, int e) {
        //调用父类电视机的方法
        super.electrify(l, n);
    }
}
