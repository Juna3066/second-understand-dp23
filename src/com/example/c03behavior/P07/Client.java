package com.example.c03behavior.P07;

import com.example.c03behavior.P07.amend.CommonUser;
import com.example.c03behavior.P07.amend.PrivateChatRoom;

public class Client {
    public static void main(String[] args) {
        //demo01();
        //demo02();

        //todo demo3
    }

    /**
     * 多用户之间的关联，由 中介聊天室维护，实现了用户之间彻底解耦
     */
    private static void demo02() {
        ChatRoom chatRoom = new ChatRoom("设计模式");
        User user3 = new User("张三");
        User user4 = new User("李四");
        User user5 = new User("王五");

        user3.login(chatRoom);
        user4.login(chatRoom);

        user3.talk("你好,四儿,就你在吗？");
        user4.talk("是,三哥");

        user5.login(chatRoom);
        user3.talk("哈,五儿也来了");
    }

    private static void demo01() {
        People p3 = new People("张三");
        People p4 = new People("李四");

        //你中有我、我中有你，谁也离不开谁的状况，双方对象的耦合性太强。
        //数学知识 排列组合复习
        //方法调用
        p3.connect(p4);
        p4.connect(p3);

        p3.talk("你好");
        p4.talk("早上好,三哥。");
    }
}
