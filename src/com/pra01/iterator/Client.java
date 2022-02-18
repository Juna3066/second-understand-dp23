package com.pra01.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        //demo01();
        //demo02();

        demo03();
    }

    private static void demo03() {
        NewDrivingRecorder rec = new NewDrivingRecorder();
        for (int i = 0; i < 12; i++) {
            rec.append("视频_" + i);
        }

        List<String> uStorage = new ArrayList<>();

        Iterator<String> it = rec.iterator();
        while (it.hasNext()) {
            String video = it.next();
            System.out.println(video);
            if ("视频_2".equals(video) || "视频_9".equals(video)) {
                uStorage.add(video);
            }
        }

        System.out.println("事故证据："+uStorage);
    }


    /**
     * 行车记录仪
     * 用户获取原始的集合数据
     * 目前提供的两个方法 有点死板
     * 直接暴漏 records 可以,但是会破坏 行车记录仪类结构
     * 改进 用 迭代器
     */
    private static void demo02() {
        DrivingRecorder rec = new DrivingRecorder();
        for (int i = 0; i < 12; i++) {
            rec.append("视频_" + i);
        }
        //rec.displayDesc();
        rec.display();
    }


    private static void demo01() {
        Book book = new Book(36);
        book.read();
    }
}
