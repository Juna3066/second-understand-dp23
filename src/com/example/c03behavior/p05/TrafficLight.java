package com.example.c03behavior.p05;

/**
 * todo 状态相关模块从 交通灯抽离 简化状态转化; 状态逻辑 实体化
 */
public class TrafficLight {
    private String state = "绿";

    public void toGreen() {
        if ("红".equals(state)) {
            System.out.println("不能直接转化，需要黄灯过度");
        } else if ("黄".equals(state)) {
            state = "绿";
            System.out.println("路灯亮45秒");
        } else if ("绿".equals(state)) {
            System.out.println("ERROR:重复操作");
        }
    }

    public void toYellow() {
        if ("红".equals(state) || "绿".equals(state)) {
            System.out.println("黄灯亮10秒");
        } else if ("黄".equals(state)) {
            System.out.println("ERROR:重复操作");
        }
    }

    public void roEed() {
        if ("红".equals(state)) {
            System.out.println("ERROR:重复操作");
        } else if ("黄".equals(state)) {
            state = "红";
            System.out.println("红灯亮30秒");
        } else if ("绿".equals(state)) {
            System.out.println("不能直接转化，需要黄灯过度");
        }
    }

}
