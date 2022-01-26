package com.pra03.prototype;

public class Bullet implements Cloneable{

    @Override
    protected Bullet clone() throws CloneNotSupportedException {
        return (Bullet) super.clone();
    }
}
