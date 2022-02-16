package com.pra01.mediator.optimization;

import java.util.ArrayList;
import java.util.List;

public abstract class ChatRoom {
    protected String name;
    protected List<User> userList = new ArrayList<>();

    //抽象类构造方法 public? 抽象类不能被实例化,那构造方法的作用是 让子类super 为什么不用protected呢
    //带参数 非默认构造方法 子类需要重写
    public ChatRoom(String name) {
        this.name = name;
    }

    protected void register(User user) {
        if (userList.contains(user)){
            System.out.println("无法重复登录");
            return ;
        }
        userList.add(user);
    }

    protected void deregister(User user) {
        userList.remove(user);
    }

    protected abstract void sendMsg(User from, User to, String msg);

    /**
     * 处理消息
     *
     * @param from
     * @param to
     * @param msg
     */
    protected abstract String processMsg(User from, User to, String msg);
}
