package com.example.c03behavior.p11;

import java.util.Arrays;

public class Client {
    public static void main(String[] args) {
        /*
         * BEGIN            // 脚本开始
         * MOVE 500,600;    // 鼠标指针移动到坐标(500, 600)
         *   BEGIN LOOP 5   // 开始循环5次
         *      LEFT_CLICK; // 循环体内单击左键
         *      DELAY 1;    // 每次延迟1秒
         *   END;           // 循环体结束
         * RIGHT_DOWN;      // 按下右键
         * DELAY 7200;      // 延迟2小时
         * END;             // 脚本结束
         */
        Expression sequence = new Sequence(Arrays.asList(
                new Move(500, 600),
                new Repetition(5, new Sequence(
                        Arrays.asList(
                                new LeftKeyClick(),
                                new Delay(1)
                        )
                )),
                new RightKeyDown(),
                new Delay(7200)
        ));

        sequence.interpret();
    }
}
