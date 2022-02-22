package com.pra03.proxy;

/**
 * 调制解制器 猫
 */
public class Modem implements Internet {
    public Modem(String password) throws Exception {
        if (password != "qwe123") {
            throw new Exception("拨号失败,密码错误");
        }
        System.out.println("拨号成功,连接上网");
    }

    @Override
    public void httpAccess(String url) {
        System.out.println("在访问：" + url);
    }
}
