package com.pra02.command.tv;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KeyBoard {
    public enum KeyCode {
        F1, F2, DESC, LEFT, RIGHT, UP, DOWN
    }

    //命令集接口焊接
    private Map<KeyCode, List<Command>> keyMap = new HashMap<>();

    //按钮命令绑定添加
    public void bindKeyCommand(KeyCode keyCode, List<Command> commands) {
        this.keyMap.put(keyCode, commands);
    }

    //按钮按下
    public void onKeyPress(KeyCode keyCode) {
        List<Command> commands = keyMap.get(keyCode);
        if (commands == null) {
            System.out.println("指令无效");
            return;
        }
        commands.stream().forEach(command -> command.exe());
    }

}
