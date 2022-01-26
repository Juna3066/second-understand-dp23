package com.pra03.prototype;

import java.util.Random;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            EPFactory.getInstance(random.nextInt(200));
        }
    }
}
