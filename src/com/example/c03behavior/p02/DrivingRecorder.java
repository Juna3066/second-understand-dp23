package com.example.c03behavior.p02;

public class DrivingRecorder {

    private int index = -1;
    private String[] records = new String[10];

    public void append(String record) {
        if (index == 9) {
            //索引已经在最大位置 ++超索引 先置0
            index = 0;
        } else {
            //正常覆盖下一条
            index++;
        }
        records[index] = record;
    }

    public void display() {
        //for (int i = 0; i <= index; i++) {
        for (int i = 0; i < 10; i++) {
            System.out.println(records[i]);
        }
    }

    public void displayByOrder() {
//        for (int i = index, loop = 0; loop < 10; i = i == 0 ? i = 9 : (--i), loop++) {
        for (int i = index, loop = 0; loop < 10; i = i == 0 ? i = 9 : i - 1, loop++) {
            System.out.println(records[i]);
        }
    }
}
