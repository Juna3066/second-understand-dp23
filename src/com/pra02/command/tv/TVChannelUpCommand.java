package com.pra02.command.tv;

public class TVChannelUpCommand implements Command{
    private TV tv;

    public TVChannelUpCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void exe() {
        tv.channelUp();
    }

    @Override
    public void unexe() {
        tv.channelDown();
    }
}
