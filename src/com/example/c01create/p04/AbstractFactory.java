package com.example.c01create.p04;

/**
 * 将工厂分为两个种族
 * 每个种族拥有三种兵种
 * 规定这些标准、避免工厂类 泛滥问题
 */
public interface AbstractFactory {
    LowClassUnit createLowClass();
    MidClassUnit createMidClass();
    HighClassUnit createHighClass();
}
