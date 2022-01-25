package com.example.c01create.p02;

/**
 * 坐标 左上角0，0
 * 敌机坐标x,y
 * y初始化0
 * 获取坐标
 * 飞行 y++
 */
public class EnemyPlane implements Cloneable{
    private Bullet bullet = new Bullet();
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

    public void setX(int x) {
        this.x = x;
    }

    public void setBullet(Bullet bullet) {
        this.bullet = bullet;
    }

    public void fly(){
        y++;
    }

    @Override
    protected EnemyPlane clone() throws CloneNotSupportedException {
        EnemyPlane clone = (EnemyPlane) super.clone();
        //深拷贝
        //java变量有 基本类型 和 引用类型 下面用这句话就是 深拷贝
        clone.setBullet(bullet.clone());
        return clone;
    }

}
