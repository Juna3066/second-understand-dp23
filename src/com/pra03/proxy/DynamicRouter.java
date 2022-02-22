package com.pra03.proxy;

public class DynamicRouter implements Internet{
    //此处不必要用Internet吧
    //private Modem modem;
    //一般没有特殊需求 按照面向 接口编程的标准
    private Internet modem;

    public DynamicRouter() throws Exception {
        this.modem = new Modem("qwe123");
    }

    @Override
    public void httpAccess(String url) {
        this.modem.httpAccess(url);
    }
}
