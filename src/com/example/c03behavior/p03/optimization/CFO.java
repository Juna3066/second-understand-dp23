package com.example.c03behavior.p03.optimization;

public class CFO extends Approver {
    public CFO(String name) {
        super(name);
    }

    @Override
    public void approve(int amount) {
        if (amount <= 10000) {
            System.out.println("审批通过【总监：" + name + "】");
        } else {
            System.out.println("审批不通过，金额过大【总监：" + name + "】");
        }
    }
}
