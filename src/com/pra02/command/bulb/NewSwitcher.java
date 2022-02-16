package com.pra02.command.bulb;

public class NewSwitcher {
    //此处引入命令接口依赖 使开关和灯泡消除强耦合关系
    private Command command;

    public NewSwitcher(Command command) {
        this.command = command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void btnPush() {
        this.command.exe();
    }

    public void btnPop() {
        this.command.unexe();
    }

}
