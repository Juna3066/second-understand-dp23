package com.example.c03behavior.p08.tv;

import com.example.c03behavior.p08.Command;

public class TVOnCommand implements Command {
    private TV tv;

    public TVOnCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void exe() {
        tv.on();
    }

    @Override
    public void unexe() {
        tv.off();
    }
}
