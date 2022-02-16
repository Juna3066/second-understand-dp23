package com.pra01.mediator.optimization;

public class OrdinaryUser extends User {

    public OrdinaryUser(String name) {
        super(name);
    }

    //放大权限 protected 为 public
    @Override
    public void login(ChatRoom chatRoom) {
        super.login(chatRoom);
    }

    @Override
    public void logout() {
        super.logout();
    }

    /**
     * 正常聊天室谈话
     * <p>
     * 放大权限 protected 为 public
     *
     * @param to
     * @param msg
     */
    @Override
    public void talk(User to, String msg) {
        super.talk(to, msg);
    }

    /**
     * 私人聊天室谈话
     *
     * @param msg
     */
    public void talk(String msg) {
        talk(null, msg);
    }

}
