package com.pra01.command.bulb;

public class FlashCommand implements Command {
    private Bulb bulb;
    /*闪烁标志*/
    private volatile Boolean neonFlag = false;

    public FlashCommand(Bulb bulb) {
        this.bulb = bulb;
    }

    @Override
    public void exe() {
        if (!neonFlag) {
            neonFlag = true;
            System.out.println("闪烁模式开启");
            new Thread(() -> {
                try {
                    while (neonFlag) {
                        bulb.on();
                        Thread.sleep(500);
                        bulb.off();
                        Thread.sleep(500);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }

    @Override
    public void unExe() {
        neonFlag = false;
        System.out.println("闪烁模式关闭");
    }
}
