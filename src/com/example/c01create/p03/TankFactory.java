package com.example.c01create.p03;

import java.util.Random;

public class TankFactory implements IFactory {
    @Override
    public Enemy create(int screenWidth) {
        return new Tank(new Random().nextInt(screenWidth),0);
    }
}
