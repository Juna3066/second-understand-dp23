package com.example.c01create.p01;

public class Client {
    public static void main(String[] args) {
        SunA sun = SunA.getInstance();
        SunA sun2 = SunA.getInstance();
        System.out.println(sun.equals(sun2));
    }
}
