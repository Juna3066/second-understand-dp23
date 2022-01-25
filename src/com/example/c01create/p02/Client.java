package com.example.c01create.p02;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        long startTime = System.currentTimeMillis();
//        createPlane();
        createPlane02();
        long endTime = System.currentTimeMillis();
        System.out.println("程序运行时间：" + (endTime - startTime) + "ms");
    }

    private static void createPlane02() throws CloneNotSupportedException {
        Random random = new Random();
        List<EnemyPlane> enemyPlanes = new ArrayList<>();
        for (int i = 0; i < 5000; i++) {
            enemyPlanes.add(EnemyPlaneFactory.getInstance(random.nextInt(20)));
        }
    }

    private static void createPlane() {
        Random random = new Random();
        List<EnemyPlane> enemyPlanes = new ArrayList<>();
        for (int i = 0; i < 5000; i++) {
            enemyPlanes.add(new EnemyPlane(random.nextInt(20)));
        }
    }



}
