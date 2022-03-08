package com.example.c01create.p04;

public class Client {
    public static void main(String[] args) {
        System.out.println("game start ...");
        System.out.println("双方挖矿赚钱 ...");
        System.out.println("");

//        CAFactory caFactory = new CAFactory();
//        caFactory.setXY(10,10);
//        AbstractFactory factory = caFactory.create("human");

        System.out.println("工人建造人类工厂...");
        AbstractFactory factory = new HumanFactory(10, 10);
        Unit marine = factory.createLowClass();
        marine.show();
        Unit tank = factory.createMidClass();
        tank.show();
        Unit battleship = factory.createHighClass();
        battleship.show();
        System.out.println("");

        System.out.println("工蜂建外星兽族工厂...");

//        caFactory.setXY(200,200);
//        factory = caFactory.create("alien");

        factory = new AlienFactory(200, 200);
        Unit roach = factory.createLowClass();
        roach.show();
        Unit poison = factory.createMidClass();
        poison.show();
        Unit mammoth = factory.createHighClass();
        mammoth.show();
        System.out.println("");
        System.out.println("battle start ... ");
        marine.attack();
        roach.attack();
        poison.attack();
        tank.attack();
        mammoth.attack();
        battleship.attack();

    }
}
