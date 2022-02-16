package com.pra02.command.tv;

public class TVVolumeUpCommand implements Command {
    private TV tv;

    public TVVolumeUpCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void exe() {
        tv.volumeUp();
    }

    @Override
    public void unexe() {
        tv.volumeDown();
    }
}
