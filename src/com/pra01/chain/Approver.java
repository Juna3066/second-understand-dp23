package com.pra01.chain;

public abstract class Approver {
    protected String name;
    protected Approver next;

    public Approver(String name) {
        this.name = name;
    }

    protected Approver setNext(Approver approver) {
        this.next = approver;
        return next;
    }

    public abstract void approve(int amount);
}
