package com.pra01.mediator.optimization.run;

import com.pra01.mediator.optimization.*;

public class Client {
    public static void main(String[] args) {
        //demo01();
        PublicChartRoom chartRoom = new PublicChartRoom("娱乐圈");
        OrdinaryUser ming = new OrdinaryUser("小明");
        OrdinaryUser meng = new OrdinaryUser("小梦");
        OrdinaryUser mei = new OrdinaryUser("小美");

        ming.login(chartRoom);
        meng.login(chartRoom);

        ming.talk(meng,"早上好,小梦");
        meng.talk(ming,"早上好");

        mei.login(chartRoom);
        mei.login(chartRoom);
        mei.talk(null,"昨天作业大家都写完了吗 谁让我参考下");
        ming.talk("...");

        mei.logout();
    }

    private static void demo01() {
        AdminUser admin = new AdminUser("admin");

        ChatRoom chatRoom = new PrivateChatRoom("恋爱01");
        OrdinaryUser ya = new OrdinaryUser("亚瑟");
        OrdinaryUser an = new OrdinaryUser("安琪拉");
        OrdinaryUser an2 = new OrdinaryUser("安琪拉妹妹");

        ya.login(chatRoom);
        an.login(chatRoom);
        an2.login(chatRoom);

        ya.talk("结婚吧 亲爱的");
        an.talk("不结 分手");

        admin.pick(an);
        an2.login(chatRoom);
        an2.talk("我同意");

        ya.talk("好");
    }
}
