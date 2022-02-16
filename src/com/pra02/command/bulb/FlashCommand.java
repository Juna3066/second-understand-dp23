package com.pra02.command.bulb;

public class FlashCommand implements Command {

    private Bulb bulb;
    //霓虹灯状态
    private boolean neonFlag = false;

    public FlashCommand(Bulb bulb) {
        this.bulb = bulb;
    }

    @Override
    public void exe() {
        if (!neonFlag) {
            neonFlag = true;
            System.out.println("开启霓虹灯命令");

            new Thread(() -> {
                try {
                    while (neonFlag) {
                        this.bulb.on();
                        Thread.sleep(500);
                        this.bulb.off();
                        Thread.sleep(500);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }

    @Override
    public void unexe() {
        neonFlag = false;
        System.out.println("关闭霓虹灯命令");
    }
}
