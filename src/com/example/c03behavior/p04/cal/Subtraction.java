package com.example.c03behavior.p04.cal;

public class Subtraction implements Strategy {
    @Override
    public int calculate(int a, int b) {
        return a - b;
    }
}
