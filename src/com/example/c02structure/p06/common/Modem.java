package com.example.c02structure.p06.common;

/**
 * 调制解调器 Modem
 */
public class Modem implements Internet {
    public Modem(String password) throws Exception {
        if (!"123456".equals(password)) {
            throw new Exception("拨号失败，请重试！");
        }
        System.out.println("上网拨号...连接成功");
    }

    @Override
    public void httpAccess(String url) {
        System.out.println("正在访问" + url);
    }
}
