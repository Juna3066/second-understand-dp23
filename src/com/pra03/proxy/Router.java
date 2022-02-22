package com.pra03.proxy;

import java.util.Arrays;
import java.util.List;

/**
 * 路由器 代理 上网功能
 * 增加一下限制
 */
public class Router implements Internet {

    private Internet modem;
    private List<String> blackList = Arrays.asList("音乐", "电影", "游戏");

    public Router() throws Exception {
        this.modem = new Modem("qwe123");
    }

    @Override
    public void httpAccess(String url) {
        for (String s : blackList) {
            if (url.contains(s)) {
                System.out.println("禁止访问:" + url);
                return;
            }
        }

        this.modem.httpAccess(url);
    }
}
