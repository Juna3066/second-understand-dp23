package com.example.c01create.p01;

public class SunA {
    //final 需要初始化
    private static final SunA instance = new SunA();

    private SunA(){

    }

    public static SunA getInstance() {
        return instance;
    }
}
