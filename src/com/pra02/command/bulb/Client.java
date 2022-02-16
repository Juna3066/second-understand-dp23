package com.pra02.command.bulb;


public class Client {
    public static void main(String[] args) throws InterruptedException {
        //demo01();
        demo02();
    }

    private static void demo02() throws InterruptedException {
        Bulb bulb = new Bulb();
        //命令接口 多态
        Command command = new SwitcherCommand(bulb);
        NewSwitcher switcher = new NewSwitcher(command);
        switcher.btnPush();
        switcher.btnPop();

        command = new FlashCommand(bulb);
        switcher.setCommand(command);
        switcher.btnPush();
        //三秒后 开关弹起 关闭指令
        Thread.sleep(3000);
        switcher.btnPop();
    }

    private static void demo01() {
        //开关->灯泡 耦合性太强
        Switcher switcher = new Switcher(new Bulb());
        switcher.btnPush();
        switcher.btnPop();
    }
}

