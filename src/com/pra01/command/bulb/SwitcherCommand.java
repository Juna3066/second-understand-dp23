package com.pra01.command.bulb;

public class SwitcherCommand implements Command{
    private Bulb bulb;

    public SwitcherCommand(Bulb bulb) {
        this.bulb = bulb;
    }

    @Override
    public void exe() {
        bulb.on();
    }

    @Override
    public void unExe() {
        bulb.off();
    }
}
