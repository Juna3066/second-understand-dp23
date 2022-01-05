package com.pra01.strategy.cal;

public class Subtraction implements Strategy{
    @Override
    public int calculate(int a, int b) {
        return a - b;
    }
}
