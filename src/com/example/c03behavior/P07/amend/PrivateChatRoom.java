package com.example.c03behavior.P07.amend;

public class PrivateChatRoom extends ChatRoom {

    public PrivateChatRoom(String name) {
        super(name);
    }

    @Override
    public synchronized void register(User user) {
        //super.register(user);
        if (users.size() == 2) {
            System.out.println("系统消息：聊天室已满");
            return;
        }
        super.register(user);
        System.out.printf("系统消息：欢迎【%s】加入2人聊天室【%s】\n", user.getName(), name);
    }

    @Override
    protected void deregister(User user) {
        super.deregister(user);
        System.out.printf("系统消息：【%s】离开聊天室\n", user.getName());
    }

    @Override
    protected void sendMsg(User from, User to, String msg) {
        users.forEach(user -> user.listen(from, null, msg));
    }

    @Override
    protected String processMsg(User from, User to, String msg) {
        return String.format("%s 说： %s", from.getName(), msg);
    }
}
