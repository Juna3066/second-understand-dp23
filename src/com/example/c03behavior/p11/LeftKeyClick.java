package com.example.c03behavior.p11;

/**
 * 左键单击表达式
 */
public class LeftKeyClick implements Expression{

    private Expression leftKeyDown;
    private Expression leftKeyUp;

    //单击操作不需要对外提供入参构造，所以主动实例化两个表达式
    public LeftKeyClick() {
        this.leftKeyDown = new LeftKeyDown();
        this.leftKeyUp = new LeftKeyUp();
    }

    @Override
    public void interpret() {
        leftKeyDown.interpret();
        leftKeyUp.interpret();
    }
}
