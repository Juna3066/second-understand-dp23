package com.pra01.command.bulb;

public class Client {
    public static void main(String[] args) throws Exception{
        //demo01();
        //demo02();
        demo03();
    }

    private static void demo03() throws Exception{
        Switcher switcher = new Switcher();
        Bulb bulb = new Bulb();
        Command command = new FlashCommand(bulb);
        switcher.setCommand(command);
        switcher.btnPush();
        //闪烁模式 3秒后后关闭
        Thread.sleep(3000);
        switcher.btnPop();
    }

    private static void demo02() {
        Switcher switcher = new Switcher();
        Bulb bulb = new Bulb();
        Command command = new SwitcherCommand(bulb);
        switcher.setCommand(command);
        switcher.btnPush();
        switcher.btnPop();
    }

    private static void demo01() {
        //开关->灯泡 耦合性太强
        /*Switcher switcher = new Switcher(new Bulb());
        switcher.btnPush();
        switcher.btnPop();*/
    }
}
