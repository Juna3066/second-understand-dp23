package com.pra01.mediator.optimization;

/**
 * todo 管理员可以添加更多权限 警告 禁言 等
 */
public class AdminUser extends User {

    //protected idea默认补全
    public AdminUser(String name) {
        super(name);
    }

    /**
     * 剔除用户
     *
     * @param user
     */
    public void pick(User user) {
        user.logout();
    }

}
