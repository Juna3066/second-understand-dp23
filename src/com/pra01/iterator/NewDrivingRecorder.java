package com.pra01.iterator;

import java.util.Iterator;

public class NewDrivingRecorder implements Iterable<String> {
    private String[] records = new String[10];
    private int index = -1;

    public NewDrivingRecorder() {
    }

    public void append(String rec) {
        //追加位置逻辑
        if (index == 9) {
            index = 0;
        } else {
            index++;
        }
        records[index] = rec;
    }

    @Override
    public Iterator<String> iterator() {
        return new Ite();
    }

    class Ite implements Iterator<String> {
        int loopCount = 0;
        int cursor = index;

        @Override
        public boolean hasNext() {
            return loopCount < 10;
        }

        @Override
        public String next() {
            loopCount++;
            int i = cursor;
            if (cursor == 9) {
                cursor = 0;
            } else {
                cursor++;
            }
            return records[i];
        }
    }
}