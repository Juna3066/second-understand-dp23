package com.pra03.strategy.cal;

public class Division implements Strategy {
    @Override
    public int calculate(int a, int b) {
        return a / b;
    }
}
