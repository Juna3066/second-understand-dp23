package com.example.c03behavior.p08.bulb;

import com.example.c03behavior.p08.Command;

public class FlashCommand implements Command {
    private Bulb bulb;
    //闪烁命令状态
    private volatile Boolean neonFlag = false;

    public FlashCommand(Bulb bulb) {
        this.bulb = bulb;
    }

    @Override
    public void exe() {
        if (!neonFlag) {
            neonFlag = true;
            System.out.println("闪烁命令开启");
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
    public void unexe() {
        neonFlag = false;
        System.out.println("闪烁命令关闭");
    }
}
