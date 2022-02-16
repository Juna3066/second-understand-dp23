package com.pra02.command.bulb;

public class SwitcherCommand implements Command {
    private Bulb bulb;

    public SwitcherCommand(Bulb bulb) {
        this.bulb = bulb;
    }

    @Override
    public void exe() {
        this.bulb.on();
    }

    @Override
    public void unexe() {
        this.bulb.off();
    }
}
