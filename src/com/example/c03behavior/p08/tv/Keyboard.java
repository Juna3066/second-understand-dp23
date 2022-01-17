package com.example.c03behavior.p08.tv;

import com.example.c03behavior.p08.Command;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Keyboard {
    public enum KeyCode {
        F1, F2, ESC, UP, DOWN, LEFT, RIGHT;
    }

    private Map<KeyCode, List<Command>> keyCommands = new HashMap<>();

    //按键和命令集映射
    public void bindKeyCommands(KeyCode keyCode, List<Command> commands) {
        this.keyCommands.put(keyCode, commands);
    }

    //按下按键
    public void onKeyPress(KeyCode keyCode) {
        System.out.println("按下按键 " + keyCode);
        List<Command> commands = keyCommands.get(keyCode);
        if (commands == null) {
            System.out.println("警告：无效指令");
            return;
        }
        commands.stream().forEach(command -> command.exe());
    }

}
