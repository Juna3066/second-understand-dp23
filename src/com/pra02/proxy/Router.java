package com.pra02.proxy;

import java.util.Arrays;
import java.util.List;

public class Router implements Internet{
    private Internet modern;

    private List<String> blackList = Arrays.asList("pronhub","baidu");

    public Router() throws Exception {
        this.modern = new Modern("123456");
    }

    @Override
    public void httpAccess(String url) {
        for (String s : blackList) {
            if (url.contains(s)){
                System.out.println("禁止访问-"+url);
                return;
            }
        }
        modern.httpAccess(url);
    }
}
