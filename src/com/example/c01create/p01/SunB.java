package com.example.c01create.p01;

public class SunB {
    private static SunB instance;

    private SunB(){}

    //类方法 必须使用类变量
    public static SunB getInstance() {
        if (instance == null){
            instance = new SunB();
        }
        return instance;
    }
}
