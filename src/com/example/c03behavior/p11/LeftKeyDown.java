package com.example.c03behavior.p11;

public class LeftKeyDown implements Expression{
    @Override
    public void interpret() {
        System.out.println("鼠标按下：左键");
    }
}
