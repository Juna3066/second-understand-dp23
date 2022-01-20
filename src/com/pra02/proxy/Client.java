package com.pra02.proxy;

import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) throws Exception {
        //demo01();
        //demo02();
        demo03();

    }

    private static void demo03() throws Exception {
        Internet dynamicRouter = (Internet) Proxy.newProxyInstance(DynamicRouter.class.getClassLoader(), DynamicRouter.class.getInterfaces(), new BlackFilter(new DynamicRouter()));
        dynamicRouter.httpAccess("https://www.baidu.com");
        dynamicRouter.httpAccess("https://www.google.com");
        dynamicRouter.httpAccess("https://cn.pronhub.com");
    }

    private static void demo02() throws Exception {
        Router router = new Router();
        router.httpAccess("https://www.baidu.com");
        router.httpAccess("https://www.google.com");
        router.httpAccess("https://cn.pronhub.com");
    }

    private static void demo01() throws Exception {
        Internet modern = new Modern("123456");
        modern.httpAccess("https://www.baidu.com");
        modern.httpAccess("https://www.google.com");
        modern.httpAccess("https://cn.pronhub.com");
    }
}
