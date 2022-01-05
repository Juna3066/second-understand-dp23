package com.example.c02structure.p06.internet;

public class Client {
    public static void main(String[] args) throws Exception {
//        Modem modem = new Modem("123456");
//        modem.httpAccess("https://www.baidu.com");

        Internet proxy = new RouterProxy();
        proxy.httpAccess("https://www.baidu.com?key=电影");
        proxy.httpAccess("https://www.baidu.com?key=游戏");
        proxy.httpAccess("https://www.baidu.com?key=读书");
        proxy.httpAccess("https://www.baidu.com?key=学习");
        proxy.httpAccess("https://www.baidu.com?key=github");
    }
}
