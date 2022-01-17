package com.example.c03behavior.p08.tv;

import com.example.c03behavior.p08.Command;

public class TVOffCommand implements Command {
    private TV tv;

    public TVOffCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void exe() {
        tv.off();
    }

    @Override
    public void unexe() {
        tv.on();
    }
}
