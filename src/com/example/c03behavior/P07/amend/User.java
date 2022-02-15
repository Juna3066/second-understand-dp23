package com.example.c03behavior.P07.amend;

import java.util.Objects;

public class User {
    private String name;
    //聊天室引用
    protected ChatRoom chatRoom;

    protected User(String name) {
        //初始化用户必须有名字
        this.name = name;
    }

    public String getName() {
        return name;
    }

    protected void login(ChatRoom chatRoom) {
        chatRoom.register(this);
        this.chatRoom = chatRoom;
    }

    protected void logout() {
        chatRoom.deregister(this);
        this.chatRoom = null;
    }

    protected void talk(User to, String msg) {
        if (Objects.isNull(chatRoom)) {
            System.out.println("[%s]的对话框\t您还没有登录");
            return;
        }
        chatRoom.sendMsg(this, to, msg);
    }

    public void listen(User from, User to, String msg) {
        System.out.printf("[%s]的对话框");
        System.out.println(chatRoom.processMsg(from, to, msg));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass())
            return false;
        User user = (User) obj;
        return Objects.equals(name, user.name);
    }
}
