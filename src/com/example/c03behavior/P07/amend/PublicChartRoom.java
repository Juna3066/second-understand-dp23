package com.example.c03behavior.P07.amend;

import java.util.Objects;

public class PublicChartRoom extends ChatRoom {
    public PublicChartRoom(String name) {
        super(name);
    }

    @Override
    protected void register(User user) {
        super.register(user);
        System.out.printf("系统消息：欢迎【%s】加入公共聊天室【%s】,当前人数：%d\n", user.getName(), name, users.size());
    }

    @Override
    protected void deregister(User user) {
        super.deregister(user);
        System.out.printf("系统消息：【%s】离开公共聊天室，当前人数：%d\n", user.getName(), users.size());
    }

    @Override
    protected void sendMsg(User from, User to, String msg) {
        if (Objects.isNull(to)) {
            users.forEach(user -> user.listen(from, null, msg));
            return;
        }

        users.stream().filter(user -> user.equals(to) || user.equals(from)).forEach(user -> user.listen(from, to, msg));
    }

    @Override
    protected String processMsg(User from, User to, String msg) {
        String toName = "所有人";
        if (!Objects.isNull(to)) {
            toName = to.getName();
        }
        return String.format("%s 对 %s 说： %s\n", from.getName(), toName, msg);
    }
}
