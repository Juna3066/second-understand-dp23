package com.example.c01create.p03;

import java.util.Random;

/**
 * 顶级工厂类 可以是接口 也可以是抽象类
 */
public abstract class AbFactory {
    protected Random random = new Random();

    /**
     * 实例化敌人
     * @param screenWidth
     * @return
     */
    public abstract Enemy create(int screenWidth);
}
