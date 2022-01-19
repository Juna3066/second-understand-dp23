package com.example.c03behavior.p01.mammal;

/**
 * 抽象公共行为 简洁代码
 */
public abstract class Mammal {
    public abstract void move();
    public abstract void eat();

    /*final 子方法不可重写 live模板 规范不能改变 但方法具体实现可改变*/
    public final void live(){
        move();
        eat();
    }
}
