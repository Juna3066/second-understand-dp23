package com.pra02.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.List;

public class BlackFilter implements InvocationHandler {
    private Object origin;
    private List<String> blackList = Arrays.asList("pron","hub","baidu");

    public BlackFilter(Object origin) {
        this.origin = origin;
        System.out.println("开启黑名单过滤功能");
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String arg = (String) args[0];
        for (String s : blackList) {
            if (arg.contains(s)){
                System.out.println("禁止访问-"+arg);
                return null;
            }
        }
        System.out.println("检验通过，转向实际业务");
        //this.invoke(origin,method,args);
        return method.invoke(origin,arg);
    }
}
