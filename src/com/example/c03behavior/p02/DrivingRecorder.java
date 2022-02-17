package com.example.c03behavior.p02;

public class DrivingRecorder {

    private int index = -1;
    private String[] records = new String[10];

    public DrivingRecorder() {

    }

    public void append(String record) {
        //索引已经在最大位置 ++超索引 先置0
        if (index == 9) {
            index = 0;
        }
        records[++index] = record;
    }

    public void display() {
        for (int i = 0; i <= index; i++) {
            System.out.println(records[i]);
        }
    }

    public void displayByOrder() {
        for (int i = index, loop = 0; loop < 10; i = i == 0 ? i = 9 : i) {
            System.out.println(records[i]);
        }
    }

}
