package com.pra01.mediator.optimization;

import java.util.Objects;

public class PublicChartRoom extends ChatRoom {

    public PublicChartRoom(String name) {
        super(name);
    }

    //protected
    @Override
    public void register(User user) {
        super.register(user);
        System.out.printf("系统消息：[%s]登录[%s],当前人数：%d\n", user.getName(), name, userList.size());
    }

    //protected
    @Override
    public void deregister(User user) {
        super.deregister(user);
        System.out.printf("系统消息：[%s]离开[%s],当前人数：%d\n", user.getName(), name, userList.size());
    }

    //protected
    @Override
    public void sendMsg(User from, User to, String msg) {
        //是否发送指定人
        if (Objects.isNull(to)) {
            userList.forEach(user -> {
                user.listen(from, null, msg);
            });
            return;
        }

        userList.stream().filter(user -> user.equals(to) || user.equals(from)).forEach(user -> {
            user.listen(from, to, msg);
        });
    }

    //封装吗？其他的为什么不用
    @Override
    protected String processMsg(User from, User to, String msg) {
        String toName = "所有人";
        if (!Objects.isNull(to)) {
            toName = to.getName();
        }
        return String.format("%s 对 %s 说： %s\n", from.getName(), toName, msg);
    }
}
