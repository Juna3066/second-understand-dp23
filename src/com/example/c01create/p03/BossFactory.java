package com.example.c01create.p03;

public class BossFactory implements IFactory {

    @Override
    public Enemy create(int screenWidth) {
        return new Boss(screenWidth / 2, 0);
    }
}
