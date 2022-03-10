package com.pra01.adapter;

public class Client {
    public static void main(String[] args) {
        //demo01();
        demo02();
    }

    private static void demo02() {
        //类适配器 通过继承 直接把适配对象焊接
        TriplePin tv = new TVAdapter();
        tv.electric(1,0,-1);
    }

    private static void demo01() {
        TriplePin tv = new ObjAdapter(new TV());
        tv.electric(1,0,-1);
    }
}
