package com.example.c01create.p02;

/**
 * 坐标 左上角0，0
 * 敌机坐标x,y
 * y初始化0
 * 获取坐标
 * 飞行 y++
 */
public class EnemyPlane implements Cloneable{
    private int x;
    private int y = 0;

    public EnemyPlane(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void fly(){
        y++;
    }

    @Override
    protected EnemyPlane clone() throws CloneNotSupportedException {
        return (EnemyPlane) super.clone();
    }

    public void setX(int x) {
        this.x = x;
    }
}
