package com.pra02.command.tv;

public class TVChannelDownCommand implements Command{
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
