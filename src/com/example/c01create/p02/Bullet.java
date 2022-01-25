package com.example.c01create.p02;

public class Bullet implements Cloneable {

    @Override
    protected Bullet clone() throws CloneNotSupportedException {
        return (Bullet) super.clone();
    }
}
