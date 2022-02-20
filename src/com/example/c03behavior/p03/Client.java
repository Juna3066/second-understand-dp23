package com.example.c03behavior.p03;

import com.example.c03behavior.p03.optimization.Approver;

import javax.naming.spi.StateFactory;

public class Client {
    public static void main(String[] args) {
        //demo01();
    }

    /**
     * 审批通过了,但流程有点踢皮球的感觉
     * <p>
     * 如果添加新角色 和 流程步骤
     * 逻辑会进一步增加，申请人也需要知道神情逻辑，增加了维护成本。
     * <p>
     * 工作流架构设计不合理
     */
    private static void demo01() {
        int amount = 10000;
        Staff staff = new Staff("张飞");
        if (!staff.approve(amount)) {
            Manager manager = new Manager("关羽");
            if (!manager.approve(amount)) {
                CFO cfo = new CFO("刘备");
                cfo.approve(amount);
            }
        }
    }
}
