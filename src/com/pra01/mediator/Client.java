package com.pra01.mediator;

public class Client {
    public static void main(String[] args) {
        //demo01();

        demo02();
    }

    //引入中介类 共事者解耦合
    private static void demo02() {
        ChatRoom group01 = new ChatRoom("QQ群1");
        User bao = new User("小宝");
        User tao = new User("小涛");
        User cun = new User("小村");

        bao.login(group01);
        tao.login(group01);

        bao.talk("大家早上好呀");
        tao.talk("早上好，宝哥");

        cun.login(group01);
        cun.talk("我来了");
    }

    //你中有我,我中有你,共事者 依赖性太强
    private static void demo01() {
        People ya = new People("亚瑟");
        People wu = new People("火舞");

        ya.connection(wu);
        wu.connection(ya);

        ya.talk("早上好，吃了没");
        wu.talk("吃过了");
    }
}
