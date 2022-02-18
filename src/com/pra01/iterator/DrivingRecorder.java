package com.pra01.iterator;

import java.util.List;

public class DrivingRecorder {
    private String[] records = new String[10];
    private int index = -1;

    public DrivingRecorder() {
    }

    public void append(String record) {
        index++;
        if (index > 9) {
            index = 0;
        }
        this.records[index] = record;
    }

    public void display() {
        for (int i = 0; i < 10; i++) {
            System.out.println(records[i]);
        }
    }

    public void displayDesc() {
        //0位置的下个遍历位置 9
        for (int i = index, loop = 0; loop < 10; i = i == 0 ? i = 9 : i - 1, loop++) {
            System.out.println(records[i]);
        }
    }
}
