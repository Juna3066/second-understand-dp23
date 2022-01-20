package com.pra01.template;

public class Client {
    public static void main(String[] args) {
        //demo();
        demo02();
    }

    /**
     * 个人管理系统 开发模拟
     */
    private static void demo02() {
        PM pm = new PersonManageSys();
        pm.kickoff();
    }

    /**
     * 哺乳动物展示生存技能
     */
    private static void demo() {
        Mammal mammal = new Bat();
        mammal.live();
        mammal = new Whale();
        mammal.live();
    }
}
