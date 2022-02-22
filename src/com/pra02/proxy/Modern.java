package com.pra02.proxy;

public class Modern implements Internet {
    public Modern(String password) throws Exception {
        if (!"123456".equals(password))
            throw new Exception("拨号失败...");
        System.out.println("联网成功");
    }

    @Override
    public void httpAccess(String url) {
        System.out.println("访问:" + url);
    }
}
