package com.pra01.prototype;

public class EnemyPlane implements Cloneable{
    private int x,y=0;
    private Bullet bullet;

    public EnemyPlane(int x) {
        this.x = x;
        this.bullet = new Bullet();
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Bullet getBullet() {
        return bullet;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setBullet(Bullet bullet) {
        this.bullet = bullet;
    }

    public void fly() {
        y++;
    }

    @Override
    protected EnemyPlane clone() throws CloneNotSupportedException {
        EnemyPlane clone = (EnemyPlane) super.clone();
        //深拷贝
        clone.setBullet(bullet.clone());
        return clone;
    }

    @Override
    public String toString() {
        return "EnemyPlane{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
