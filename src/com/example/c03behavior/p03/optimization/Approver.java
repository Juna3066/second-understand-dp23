package com.example.c03behavior.p03.optimization;

public abstract class Approver {
    //基类成员变量 用 protect
    protected String name;
    protected Approver nextApprover;

    public Approver(String name) {
        this.name = name;
    }

    //使支持链式编程 基类成员方法 用 protected
    protected Approver setNext(Approver nextApprover) {
        this.nextApprover = nextApprover;
        return nextApprover;
    }

    /**
     * 由子类去实现具体审批逻辑
     *
     * @param amount 审批金额
     * @return 是否通过审批
     */
    public abstract void approve(int amount);
}
