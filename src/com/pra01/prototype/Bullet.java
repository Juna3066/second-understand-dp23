package com.pra01.prototype;

public class Bullet implements Cloneable {

    @Override
    protected Bullet clone() throws CloneNotSupportedException {
        return (Bullet) super.clone();
    }

    @Override
    public String toString() {
        return "子弹" + super.toString();
    }
}
