package com.pra01.proxy;

public class Modem implements Internet {

    public Modem(String password) throws Exception {
        if (!"2255".equals(password)) {
            throw new Exception("拨号失败,请重试！");
        }
        System.out.println("拨号中...联网成功");
    }

    @Override
    public void httpAccess(String url) {
        System.out.println("访问网址" + url);
    }
}
