package com.example.c03behavior.p08.bulb;

import com.example.c03behavior.p08.Command;

public class SwitcherCommand implements Command {
    private Bulb bulb;

    public SwitcherCommand(Bulb bulb) {
        this.bulb = bulb;
    }

    @Override
    public void exe() {
        bulb.on();
    }

    @Override
    public void unexe() {
        bulb.off();
    }
}
