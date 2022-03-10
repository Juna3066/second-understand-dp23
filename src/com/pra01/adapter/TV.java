package com.pra01.adapter;

public class TV implements DualPin{
    @Override
    public void electric(int l, int n) {
        System.out.printf("电视通电启动[火线：%d，零线：%d]\n",l,n);
    }
}
