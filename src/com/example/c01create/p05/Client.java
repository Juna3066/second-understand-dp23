package com.example.c01create.p05;

public class Client {
    public static void main(String[] args) {
        Director director = new Director(new HouseBuilder());
        System.out.println(director.direct());
        director.setBuilder(new ApartmentBuilder());
        System.out.println(director.direct());
    }
}
