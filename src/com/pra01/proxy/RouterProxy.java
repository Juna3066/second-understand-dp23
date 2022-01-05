package com.pra01.proxy;

import java.util.Arrays;
import java.util.List;

public class RouterProxy implements Internet {
    private List<String> blackList = Arrays.asList("电影", "音乐", "游戏", "小说");
    private Internet modem;

    public RouterProxy() throws Exception {
        this.modem = new Modem("2255");
    }

    @Override
    public void httpAccess(String url) {
        for (String s : blackList) {
            if (url.contains(s)) {
                System.out.println("禁止访问" + url);
                return;
            }
        }
        modem.httpAccess(url);
    }
}
