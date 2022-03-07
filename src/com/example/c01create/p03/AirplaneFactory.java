package com.example.c01create.p03;

import java.util.Random;

public class AirplaneFactory implements IFactory {

    @Override
    public Enemy create(int screenWidth) {
//        return new Airplane(new Random(screenWidth).nextInt(), 0);
        return new Airplane(new Random().nextInt(screenWidth), 0);
    }
}
