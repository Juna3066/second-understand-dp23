package com.example.c03behavior.p08.bulb;

import com.example.c03behavior.p08.Command;

public class NewSwitcher {
    private Command command;

    //注入命令
    public void setCommand(Command command) {
        this.command = command;
    }

    //按钮事件绑定
    public void btnPush() {
        System.out.println("按钮按下");
        command.exe();
    }

    public void btnPop() {
        System.out.println("按钮弹起");
        command.unexe();
    }
}
