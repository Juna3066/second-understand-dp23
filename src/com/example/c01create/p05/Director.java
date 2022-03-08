package com.example.c01create.p05;

public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public Building direct() {
        System.out.println("===工程启动===");
        builder.buildBasement();
        builder.buildWall();
        builder.buildRoof();

        System.out.println("===工程竣工===");
        return builder.getBuilding();
    }
}
