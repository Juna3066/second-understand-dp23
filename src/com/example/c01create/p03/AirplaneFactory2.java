package com.example.c01create.p03;

public class AirplaneFactory2 extends AbFactory {
    @Override
    public Enemy create(int screenWidth) {
        return new Airplane(random.nextInt(screenWidth), 0);
    }
}
