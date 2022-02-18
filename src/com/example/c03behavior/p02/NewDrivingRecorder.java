package com.example.c03behavior.p02;

import java.util.Iterator;
import java.util.Objects;

public class NewDrivingRecorder implements Iterable<String> {
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

    @Override
    public Iterator<String> iterator() {
        return new Itr();
    }

    //迭代器轻松访问 行车记录仪私有数据的同事 达到了和 集合分离目的
    private class Itr implements Iterator<String> {
        //迭代器游标 不波及原始集合索引
        int cursor = index;
        int loopCount = 0;

        @Override
        public boolean hasNext() {
            //next is not null then next
            return loopCount < 10 && records[cursor] != null;
        }

        @Override
        public String next() {
            int i = cursor;
            if (cursor == 0) {
                cursor = 9;
            } else {
                cursor--;
            }
            loopCount++;
            return records[i];
        }
    }
}
