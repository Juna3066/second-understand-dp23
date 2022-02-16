package com.pra01.mediator.optimization;

public class PrivateChatRoom extends ChatRoom {

    public PrivateChatRoom(String name) {
        super(name);
    }

    @Override
    protected synchronized void register(User user) {
        if (userList.size() == 2) {
            System.out.println("系统消息：聊天室满");
            return;
        }

        super.register(user);
        System.out.printf("系统消息：%s 加入2人聊天室[%s]\n", user.getName(), name);
    }

    @Override
    protected void deregister(User user) {
        super.deregister(user);
        System.out.printf("系统消息：%s 离开2人聊天室[%s]\n", user.getName(), name);
    }

    @Override
    protected void sendMsg(User from, User to, String msg) {
        userList.forEach(user -> user.listen(from, null, msg));
    }

    @Override
    protected String processMsg(User from, User to, String msg) {
        return String.format("%s 说：%s\n", from.getName(), msg);
    }
}
