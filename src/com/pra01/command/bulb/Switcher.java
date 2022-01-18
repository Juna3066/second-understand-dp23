package com.pra01.command.bulb;

public class Switcher {
/*    private Bulb bulb;

    public Switcher(Bulb bulb) {
        this.bulb = bulb;
    }*/

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void btnPush() {
        System.out.println("按钮按下");
        //bulb.on();
        command.exe();
    }

    public void btnPop() {
        System.out.println("按钮弹起");
        //bulb.off();
        command.unExe();
    }
}
