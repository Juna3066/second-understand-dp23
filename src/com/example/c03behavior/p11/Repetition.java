package com.example.c03behavior.p11;

/**
 * 循环表达式
 */
public class Repetition implements Expression {
    private int loopCount;
    //虚幻体内子表达式序列
    private Expression loopBodySequence;

    public Repetition(int loopCount, Expression loopBodySequence) {
        this.loopCount = loopCount;
        this.loopBodySequence = loopBodySequence;
    }

    @Override
    public void interpret() {
        while (loopCount > 0) {
            loopBodySequence.interpret();
            loopCount--;
        }
    }
}
