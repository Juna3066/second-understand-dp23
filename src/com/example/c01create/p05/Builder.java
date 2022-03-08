package com.example.c01create.p05;

/**
 * 开发商规定的 施工队的施工标准
 */
public interface Builder {
    /**
     * 建造地基
     */
    void buildBasement();

    /**
     * 建造墙体
     */
    void buildWall();

    /**
     * 建造房顶
     */
    void buildRoof();

    /**
     * 获取建筑
     *
     * @return
     */
    Building getBuilding();
}
