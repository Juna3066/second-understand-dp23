package com.pra03.prototype;

public class EnemyPlane implements Cloneable {
    private int x;
    private int y = 0;
    private Bullet bullet = new Bullet();

    public EnemyPlane(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void fly() {
        y++;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setBullet(Bullet bullet) {
        this.bullet = bullet;
    }

    /*打印使用*/
    public Bullet getBullet() {
        return bullet;
    }

    @Override
    protected EnemyPlane clone() throws CloneNotSupportedException {
        EnemyPlane clone = (EnemyPlane) super.clone();
        clone.setBullet(bullet.clone());
        return clone;
    }
}
