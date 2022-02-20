package com.pra01.chain;

public class Client {
    public static void main(String[] args) {
        Approver staff = new Staff("小白");
        Approver manager = new Manager("小黑");
        Approver cfo = new CFO("无限");

        staff.setNext(manager).setNext(cfo);
        staff.approve(15000);
        staff.approve(9000);
    }
}
