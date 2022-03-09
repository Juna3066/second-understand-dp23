package com.example.c03behavior.p11;

public class LeftKeyUp implements Expression{
    @Override
    public void interpret() {
        System.out.println("鼠标松开：左键");
    }
}
