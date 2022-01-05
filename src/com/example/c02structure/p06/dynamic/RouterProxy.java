package com.example.c02structure.p06.dynamic;

import com.example.c02structure.p06.common.Internet;
import com.example.c02structure.p06.common.Modem;

/**
 * 路由器
 */
public class RouterProxy implements Internet {
    private Internet modem;
//    private List<String> blackList = Arrays.asList("电影", "音乐", "游戏");

    public RouterProxy() throws Exception {
        this.modem = new Modem("123456");
    }

    @Override
    public void httpAccess(String url) {
//        for (String s : blackList) {
//            if (url.contains(s)) {
//                System.out.println("禁止访问" + url);
//                return;
//            }
//        }
        modem.httpAccess(url);
    }
}
