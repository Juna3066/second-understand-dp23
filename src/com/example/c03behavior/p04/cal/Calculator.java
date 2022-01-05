package com.example.c03behavior.p04.cal;

public class Calculator {
    /*public int add(int a,int b){
        return a+b;
    }
    public int sub(int a,int b){
        return a-b;
    }*/

    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public int getResult(int a, int b) {
        return strategy.calculate(a, b);
    }
}
