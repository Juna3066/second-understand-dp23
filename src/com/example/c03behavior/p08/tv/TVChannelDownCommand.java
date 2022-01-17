package com.example.c03behavior.p08.tv;

import com.example.c03behavior.p08.Command;

public class TVChannelDownCommand implements Command {
    private TV tv;

    public TVChannelDownCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void exe() {
        tv.channelDown();
    }

    @Override
    public void unexe() {
        tv.channelUp();
    }
}
