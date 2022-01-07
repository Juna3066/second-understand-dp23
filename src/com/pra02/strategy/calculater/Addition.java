package com.pra02.strategy.calculater;

public class Addition implements Strategy {
    @Override
    public double calculate(double a, double b) {
        return a + b;
    }
}
