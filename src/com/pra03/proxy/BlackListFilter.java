package com.pra03.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

/**
 * 动态代理
 * 就是把代理 相关的业务抽离抽来 然后通过另外一种形式去执行
 */
public class BlackListFilter implements InvocationHandler {
    //被代理对象
    private Object origin;
    private List<String> blackList = Arrays.asList("音乐", "电影", "游戏");

    public BlackListFilter(Object origin) {
        this.origin = origin;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String url = (String) args[0];

        for (String s : blackList) {
            if (url.contains(s)) {
                System.out.println("禁止访问:" + url);
                return null;
            }
        }
        System.out.println("转向实际业务...");
        //return this.invoke(origin,method,args);
        //方法调用 被代理对象的接口方法被调用
        return method.invoke(origin,args);
    }
}
