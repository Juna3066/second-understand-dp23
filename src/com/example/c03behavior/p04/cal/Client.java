package com.example.c03behavior.p04.cal;

public class Client {
    public static void main(String[] args) {
        //System.out.println(new Calculator().add(2, 3));

        Calculator calculator = new Calculator();
        //计算器注入加法策略
        calculator.setStrategy(new Addition());
        System.out.println(calculator.getResult(2, 3));
        //计算器注入减法策略
        calculator.setStrategy(new Subtraction());
        System.out.println(calculator.getResult(2, 3));
    }
}
