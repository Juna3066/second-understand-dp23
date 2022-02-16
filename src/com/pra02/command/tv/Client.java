package com.pra02.command.tv;

import java.util.Arrays;

public class Client {
    public static void main(String[] args) {
        TV tv = new TV();
        KeyBoard keyBoard = new KeyBoard();

        //自定义遥控器命令集
        keyBoard.bindKeyCommand(KeyBoard.KeyCode.F1, Arrays.asList(new TVOnCommand(tv)));
        keyBoard.bindKeyCommand(KeyBoard.KeyCode.DESC, Arrays.asList(new TVOffCommand(tv)));
        keyBoard.bindKeyCommand(KeyBoard.KeyCode.DOWN, Arrays.asList(new TVChannelDownCommand(tv)));
        keyBoard.bindKeyCommand(KeyBoard.KeyCode.UP, Arrays.asList(new TVChannelUpCommand(tv)));
        keyBoard.bindKeyCommand(KeyBoard.KeyCode.LEFT, Arrays.asList(new TVVolumeDownCommand(tv)));
        keyBoard.bindKeyCommand(KeyBoard.KeyCode.RIGHT, Arrays.asList(new TVVolumeUpCommand(tv)));

        keyBoard.onKeyPress(KeyBoard.KeyCode.F1);
        keyBoard.onKeyPress(KeyBoard.KeyCode.UP);
        keyBoard.onKeyPress(KeyBoard.KeyCode.UP);
        keyBoard.onKeyPress(KeyBoard.KeyCode.F2);
        keyBoard.onKeyPress(KeyBoard.KeyCode.DOWN);
        keyBoard.onKeyPress(KeyBoard.KeyCode.DESC);
    }
}
