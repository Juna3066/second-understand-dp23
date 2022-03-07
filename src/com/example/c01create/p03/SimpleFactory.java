package com.example.c01create.p03;

import java.util.Random;

public class SimpleFactory {
    private Random random;
    private int screenWidth;

    public SimpleFactory(int screenWidth) {
        this.screenWidth = screenWidth;
        this.random = new Random();
    }

    public Enemy create(String type) {
        Enemy enemy = null;
        int x = this.random.nextInt(this.screenWidth);
        switch (type) {
            case "airplane":
                enemy = new Airplane(x, 0);
                break;
            case "tank":
//                return new Tank(x,0);
                enemy = new Tank(x, 0);
                break;
        }
        return enemy;
    }
}
