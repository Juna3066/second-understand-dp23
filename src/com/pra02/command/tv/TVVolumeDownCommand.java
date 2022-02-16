package com.pra02.command.tv;

public class TVVolumeDownCommand implements Command{
    private TV tv;

    public TVVolumeDownCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void exe() {
        tv.volumeDown();
    }

    @Override
    public void unexe() {
        tv.volumeUp();
    }
}
