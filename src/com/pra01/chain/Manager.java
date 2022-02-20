package com.pra01.chain;

public class Manager extends Approver{

    public Manager(String name) {
        super(name);
    }

    @Override
    public void approve(int amount) {
        if (amount <= 5000) {
            System.out.println("Manager.approve ok [handler: "+name+"] ");
        } else {
            System.out.println("Manager.approve fail [handler: "+name+"] ");
            next.approve(amount);
        }
    }
}
