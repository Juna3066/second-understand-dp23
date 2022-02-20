package com.example.c03behavior.p03.optimization;

public class Client {
    public static void main(String[] args) {
        Approver staff = new Staff("张飞");
        Approver manager = new Manager("关于");
        Approver cfo = new CFO("刘备");

        //注意返回值 返回的就是设置的下一个审批人
        //protect 本类 同包类 不同包子类 可以访问; 不同包非子类无法访问。。
        staff.setNext(manager).setNext(cfo);
        staff.approve(10000);
    }
}
