package com.pra03.proxy;

import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) throws Exception {
        //demo01();
        //demo02();
        //demo03();
        demo04();

    }

    //动态代理 实际上 需要一个接口 一个接口实现  被代理的对象一般是接口实现的那个类
    private static void demo04() {
        //只能转被代理对象实现的接口 否则报错
        //动态代理源码
        Intranet mSwitch = (Intranet) Proxy.newProxyInstance(Switch.class.getClassLoader(), Switch.class.getInterfaces(), new BlackListFilter(new Switch()));
        mSwitch.fileAccess("\\\\192.68.1.2\\共享\\电影\\IronHuman.mp4");
        mSwitch.fileAccess("\\\\192.68.1.2\\共享\\游戏\\Hero.exe");
        mSwitch.fileAccess("\\\\192.68.1.4\\shared\\Java学习资料.zip");
        mSwitch.fileAccess("\\\\192.68.1.6\\Java\\设计模式.doc");
    }

    private static void demo03() throws Exception {
        //有必要多态吗 必须的 否则报错 动态代理使用参数注意
        Internet router = (Internet) Proxy.newProxyInstance(
//                Internet.class.getClassLoader(),
                DynamicRouter.class.getClassLoader(),
                DynamicRouter.class.getInterfaces(),
//                Internet.class.getInterfaces(),
                new BlackListFilter(new DynamicRouter())
        );
        router.httpAccess("https://www.baidu.com?key=电影");
        router.httpAccess("https://www.baidu.com?key=音乐");
        router.httpAccess("https://www.baidu.com?key=读书");
    }

    private static void demo02() throws Exception {
        Router router = new Router();
        router.httpAccess("https://www.baidu.com?key=电影");
        router.httpAccess("https://www.baidu.com?key=音乐");
        router.httpAccess("https://www.baidu.com?key=读书");
    }

    private static void demo01() throws Exception {
        Modem modem = new Modem("qwe123");
        modem.httpAccess("https://www.baidu.com");
    }
}
