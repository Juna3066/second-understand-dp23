package com.pra03.strategy.cal;

public class Client {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        cal.setStrategy(new Addition());
        System.out.println(cal.getResult(2, 4));

        cal.setStrategy(new Multiplication());
        System.out.println(cal.getResult(12, 23));
    }
}
