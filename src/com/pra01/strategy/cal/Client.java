package com.pra01.strategy.cal;

public class Client {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.setStrategy(new Multiplication());
        System.out.println(c.getResult(2,3));

        c.setStrategy(new Division());
        System.out.println(c.getResult(921,26));
    }
}
