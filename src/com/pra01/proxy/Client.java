package com.pra01.proxy;

import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) throws Exception{
        Internet modem = new Modem("2255");
        modem.httpAccess("http://www.电影.com");
        modem.httpAccess("http://www.小说.com");
        modem.httpAccess("http://www.java学习.com");

        //路由器代理 调制解调器 Modem(猫) 的上网功能
        Internet router = new RouterProxy();
        router.httpAccess("http://www.电影.com");
        router.httpAccess("http://www.小说.com");
        router.httpAccess("http://www.java学习.com");

        //动态代理 分离过滤逻辑 多代理对象公用 黑名单过滤逻辑
        Internet internet = (Internet) Proxy.newProxyInstance(
                RouterDynamicProxy.class.getClassLoader(),
                RouterDynamicProxy.class.getInterfaces(),
                new BlackListFilter(new RouterDynamicProxy()));
        internet.httpAccess("http://www.电影.com");
        internet.httpAccess("http://www.小说.com");
        internet.httpAccess("http://www.java学习.com");
    }
}
