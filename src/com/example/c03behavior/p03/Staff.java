package com.example.c03behavior.p03;

public class Staff {
    private String name;

    public Staff(String name) {
        this.name = name;
    }

    public boolean approve(int amount) {
        if (amount <= 1000) {
            System.out.println("审批通过【专员：" + name + "】");
            return true;
        } else {
            System.out.println("无权审批，请找上级【专员：" + name + "】");
            return false;
        }
    }
}
