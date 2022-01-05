package com.pra01.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.Arrays;
import java.util.List;

public class BlackListFilter implements InvocationHandler {
    private List<String> blackList = Arrays.asList("电影", "音乐", "游戏", "小说");
    //被代理对象
    private Object origin;

    public BlackListFilter(Object origin) {
        this.origin = origin;
        System.out.println("开启访问黑名单过滤功能");
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String arg = args[0].toString();
        for (String s : blackList) {
            if (arg.contains(s)) {
                System.out.println("禁止访问" + arg);
                return null;
            }
        }
        System.out.println("通过校验，转向业务");
        return method.invoke(origin, arg);
    }
}
