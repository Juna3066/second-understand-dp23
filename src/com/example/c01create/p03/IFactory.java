package com.example.c01create.p03;

public interface IFactory {
    /**
     * 实例化敌人
     * @param screenWidth 屏幕宽度
     * @return
     */
    Enemy create(int screenWidth);
}
