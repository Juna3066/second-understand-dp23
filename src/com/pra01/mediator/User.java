package com.pra01.mediator;

import javax.print.attribute.standard.MediaSize;

public class User {
    private String name;
    //聊天室引用
    private ChatRoom chatRoom;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void login(ChatRoom chatRoom) {
        //注入聊天室
        this.chatRoom = chatRoom;
        chatRoom.register(this);
    }

    public void listen(User from, String msg) {
        System.out.printf("[%s 对话框] %s说：%s\n", this.name, from.getName(), msg);
    }

    public void talk(String msg) {
        chatRoom.sendMsg(this, msg);
    }
}
