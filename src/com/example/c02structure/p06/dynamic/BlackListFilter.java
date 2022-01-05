package com.example.c02structure.p06.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

public class BlackListFilter implements InvocationHandler {
    private List<String> blackList = Arrays.asList("电影","音乐","游戏");
    //被代理的对象
    private Object origin;

    public BlackListFilter(Object origin){
        this.origin = origin;
        System.out.println("开启黑名单过滤功能...");
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //切入方法面之前的过滤逻辑
        String arg = args[0].toString();
        for (String s : blackList) {
            if (arg.contains(s)){
                System.out.println("禁止访问"+arg);
                return null;
            }
        }
        System.out.println("校验通过，转向实际业务");
        //调用被代理对象方法
        return method.invoke(origin,arg);
    }
}
