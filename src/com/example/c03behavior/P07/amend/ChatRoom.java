package com.example.c03behavior.P07.amend;

import java.util.ArrayList;
import java.util.List;

/**
 * 重构聊天室类
 * 增加 私密聊天 VIP更高权限功能
 * 聊天室类和用户类进行 多态化设计
 */
public abstract class ChatRoom {
    protected String name;
    protected List<User> users = new ArrayList<>();

    public ChatRoom(String name) {
        this.name = name;
    }

    protected void register(User user) {
        this.users.add(user);
    }

    protected void deregister(User user) {
        users.remove(user);
    }

    //系统框架一旦构建，子类便可进行无限扩展
    protected abstract void sendMsg(User from, User to, String msg);

    protected abstract String processMsg(User from, User to, String msg);

}
