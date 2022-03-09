package com.example.c03behavior.p11;

public class RightKeyDown implements Expression {
    @Override
    public void interpret() {
        System.out.println("鼠标按下：右键");
    }
}
