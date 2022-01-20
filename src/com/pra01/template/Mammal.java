package com.pra01.template;

/**
 * 哺乳动物 父类
 */
public abstract class Mammal {
    public abstract void eat();
    public abstract void move();

    //final 定义其生存模板
    public final void live(){
        move();
        eat();
    };
}
