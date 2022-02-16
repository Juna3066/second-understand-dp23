package com.pra02.command.bulb;

public class Switcher {
    private Bulb bulb;

    public Switcher(Bulb bulb) {
        this.bulb = bulb;
    }

    public void btnPush() {
        this.bulb.on();
    }

    public void btnPop() {
        this.bulb.off();
    }

}
