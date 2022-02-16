package com.pra01.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom {
    private String name;
    private List<User> userList = new ArrayList<>();

    public ChatRoom(String name) {
        this.name = name;
    }

    public void register(User user) {
        this.userList.add(user);
        System.out.printf("欢迎登录聊天室[%s],祝你心情愉悦[%s]\n", this.name, user.getName());
    }

    public void sendMsg(User from, String msg) {
        //消息群发
        userList.stream().forEach(user -> {
            user.listen(from, msg);
        });
    }

}
