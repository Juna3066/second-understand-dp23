package com.pra03.strategy.cal;

public class Multiplication implements Strategy {
    @Override
    public int calculate(int a, int b) {
        return a * b;
    }
}
