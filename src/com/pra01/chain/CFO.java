package com.pra01.chain;

public class CFO extends Approver {
    public CFO(String name) {
        super(name);
    }

    @Override
    public void approve(int amount) {
        if (amount <= 10000) {
            System.out.println("CFO.approve ok [handler: "+name+"] ");
        } else {
            System.out.println("CFO.approve fail [handler: "+name+"] ");
            //next.approve(amount);
        }
    }
}
