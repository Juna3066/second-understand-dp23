package com.example.c01create.p04;

import java.security.spec.RSAOtherPrimeInfo;

/**
 * 工厂的工厂
 */
public class CAFactory {
    private int x,y;

    public CAFactory() {
    }

    public CAFactory(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public AbstractFactory create(String type){
        if ("alien".equals(type)){
            return new AlienFactory(x,y);
        }else if("human".equals(type)){
            return new HumanFactory(x,y);
        }else {
            System.out.println("no type");
            return null;
        }
    }
}
