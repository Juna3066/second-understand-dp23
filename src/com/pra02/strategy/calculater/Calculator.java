package com.pra02.strategy.calculater;

public class Calculator {
    private Strategy strategy;
    public void setStrategy(Strategy strategy){
        this.strategy = strategy;
    }

    public double getResult(double a,double b){
        return strategy.calculate(a,b);
    }
}
