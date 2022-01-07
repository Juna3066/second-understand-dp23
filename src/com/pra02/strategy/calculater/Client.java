package com.pra02.strategy.calculater;


public class Client {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.setStrategy(new Addition());
        System.out.println(c.getResult(22.4,232.123));

        c.setStrategy(new Division());
        System.out.println(c.getResult(22.4,232.123));

        c.setStrategy(new Multiplication());
        System.out.println(c.getResult(22.4,232.123));

        c.setStrategy(new Subtraction());
        System.out.println(c.getResult(22.4,232.123));
    }
}
