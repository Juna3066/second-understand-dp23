package com.example.c03behavior.p08.tv;

import com.example.c03behavior.p08.Command;

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
