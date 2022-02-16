package com.pra01.mediator.optimization;

import java.util.Objects;

public class User {
    private String name;
    protected ChatRoom chatRoom;

    //非抽象类 为啥要用protected呢 纯粹不让不同包非子类不能调用吗
    protected User(String name) {
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
        chatRoom = null;
    }

    //此处是protected 本类 同包 不同包子类 可以调用该方法
    protected void talk(User to, String msg) {
        //发言前判断是否登录
        if (Objects.isNull(chatRoom)) {
            System.out.printf("[%s的对话框] 请先登录\n", name);
            return;
        }
        chatRoom.sendMsg(this, to, msg);
    }

    //此处是public 不同包非子类 也可以调用该方法
    public void listen(User from, User to,String msg) {
        System.out.printf("[%s的对话框]\t", name);
        //here to
        System.out.printf(this.chatRoom.processMsg(from, to, msg));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        User user = (User) obj;
        //本类中可以访问
        return Objects.equals(this.name, user.name);
    }
}
