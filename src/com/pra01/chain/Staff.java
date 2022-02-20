package com.pra01.chain;

public class Staff extends Approver {
    public Staff(String name) {
        super(name);
    }

    @Override
    public void approve(int amount) {
        if (amount <= 1000) {
            System.out.println("Staff.approve ok [handler: "+name+"] ");
        } else {
            System.out.println("Staff.approve fail [handler: "+name+"] ");
            next.approve(amount);
        }
    }
}
