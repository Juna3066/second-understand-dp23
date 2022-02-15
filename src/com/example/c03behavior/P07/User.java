package com.example.c03behavior.P07;

public class User {
    private String name;
    //聊天室引用
    private ChatRoom chatRoom;

    public User(String name) {
        //初始化用户必须有名字
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void login(ChatRoom chatRoom) {
        this.chatRoom = chatRoom;
        this.chatRoom.register(this);
    }

    public void listen(User fromWhom, String msg) {
        System.out.printf("[%s]的对话框\t", this.name);
        System.out.printf("%s说：\t%s\n", fromWhom.getName(), msg);
    }

    public void talk(String msg) {
        chatRoom.sendMsg(this, msg);
    }

}
