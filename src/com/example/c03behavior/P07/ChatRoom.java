package com.example.c03behavior.P07;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom {
    private String name;
    private List<User> users = new ArrayList<>();

    public ChatRoom(String name) {
        this.name = name;
    }

    public void register(User user) {
        this.users.add(user);
        System.out.printf("欢迎【%s】加入聊天室【%s】\n", user.getName(), this.name);
    }

    public void sendMsg(User fromWhom, String msg) {
        users.stream().forEach(toWhom -> toWhom.listen(fromWhom, msg));
    }
}
