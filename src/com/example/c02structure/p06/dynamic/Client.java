package com.example.c02structure.p06.dynamic;

import com.example.c02structure.p06.common.Internet;

import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) throws Exception {

        Internet internet = (Internet) Proxy.newProxyInstance(
                RouterProxy.class.getClassLoader(),
                RouterProxy.class.getInterfaces(),
                new BlackListFilter(new RouterProxy()));
        internet.httpAccess("http://www.电影.com");
        internet.httpAccess("http://www.游戏.com");
        internet.httpAccess("http://www.学习.com");
        internet.httpAccess("http://www.工作.com");


        Intranet intranet = (Intranet) Proxy.newProxyInstance(
                Switch.class.getClassLoader(),
                Switch.class.getInterfaces(),
                new BlackListFilter(new Switch()));
        intranet.fileAccess("\\\\192.68.1.2\\共享\\电影\\IronHuman.mp4");
        intranet.fileAccess("\\\\192.68.1.2\\共享\\游戏\\Hero.exe");
        intranet.fileAccess("\\\\192.68.1.4\\shared\\Java学习资料.zip");
        intranet.fileAccess("\\\\192.68.1.6\\Java\\设计模式.doc");
    }
}
