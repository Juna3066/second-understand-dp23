package com.pra01.command.bulb;

public class FlashCommand implements Command {
    private Bulb bulb;
    private Boolean flashFlag = false;

    public FlashCommand(Bulb bulb) {
        this.bulb = bulb;
    }

    @Override
    public void exe() {
        if (!flashFlag) {
            flashFlag = true;
            System.out.println("闪烁模式开启");
            new Thread(() -> {
                try {
                    while (flashFlag) {
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
        flashFlag = false;
        System.out.println("闪烁模式关闭");
    }
}
