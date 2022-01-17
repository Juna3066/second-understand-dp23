package com.example.c03behavior.p08.tv;

import com.example.c03behavior.p08.Command;

public class TVVolumeDownCommand implements Command {
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
