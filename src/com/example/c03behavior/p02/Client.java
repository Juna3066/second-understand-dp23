package com.example.c03behavior.p02;

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
        NewDrivingRecorder recorder = new NewDrivingRecorder();
        for (int i = 0; i < 5; i++) {
            recorder.append("视频_" + i);
        }

        List<String> uStorage = new ArrayList<>();

        Iterator<String> it = recorder.iterator();
        while (it.hasNext()) {
            String video = it.next();
            System.out.println(video);
            //用户翻看视频 发现 10 8 作为证据视频
            if ("视频_10".equals(video) || "视频_8".equals(video)) {
                uStorage.add(video);
            }
        }

        //u盘给交警查看
        System.out.println("事故证据：" + uStorage);
    }

    private static void demo02() {
        DrivingRecorder recorder = new DrivingRecorder();
        for (int i = 0; i < 15; i++) {
            //数字格式化
            recorder.append("视频_" + i);
        }
        recorder.display();
        System.out.println("============");
        recorder.displayByOrder();
    }

    private static void demo01() {
        Book book = new Book(99);
        book.read();
    }
}
