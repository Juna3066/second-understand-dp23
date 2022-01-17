package com.example.c03behavior.p08;

import com.example.c03behavior.p08.Command;
import com.example.c03behavior.p08.bulb.*;
import com.example.c03behavior.p08.tv.*;

import java.util.Arrays;

public class Client {
    public static void main(String[] args) throws Exception{
        //demo01();
        //demo02();
        //demo03();

        Keyboard keyboard = new Keyboard();
        TV tv = new TV();

        TVOnCommand tvOnCommand = new TVOnCommand(tv);
        TVOffCommand tvOffCommand = new TVOffCommand(tv);
        TVChannelUpCommand tvChannelUpCommand = new TVChannelUpCommand(tv);

        keyboard.bindKeyCommands(Keyboard.KeyCode.F1, Arrays.asList(tvOnCommand));
        keyboard.bindKeyCommands(Keyboard.KeyCode.ESC, Arrays.asList(tvOffCommand));
        keyboard.bindKeyCommands(Keyboard.KeyCode.LEFT, Arrays.asList(tvChannelUpCommand));

        keyboard.onKeyPress(Keyboard.KeyCode.F1);
        keyboard.onKeyPress(Keyboard.KeyCode.F2);
        keyboard.onKeyPress(Keyboard.KeyCode.LEFT);
        keyboard.onKeyPress(Keyboard.KeyCode.ESC);
    }

    private static void demo03() throws InterruptedException {
        NewSwitcher newSwitcher = new NewSwitcher();
        Command command = new FlashCommand(new Bulb());
        newSwitcher.setCommand(command);

        newSwitcher.btnPush();
        Thread.sleep(3000);
        newSwitcher.btnPop();
    }

    /**
     * 命令模式
     */
    private static void demo02() {
        NewSwitcher newSwitcher = new NewSwitcher();
        Command command = new SwitcherCommand(new Bulb());
        newSwitcher.setCommand(command);
        newSwitcher.btnPush();
        newSwitcher.btnPop();
    }

    private static void demo01() {
        //开关与灯连接  开关->灯  绑定了,强耦合
        Switcher switcher = new Switcher(new Bulb());
        switcher.btnPush();
        switcher.btnPop();
    }
}
