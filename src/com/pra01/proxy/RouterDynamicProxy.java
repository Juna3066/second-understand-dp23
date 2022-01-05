package com.pra01.proxy;

public class RouterDynamicProxy implements Internet {
    private Internet modem;

    public RouterDynamicProxy() throws Exception {
        this.modem = new Modem("2255");
    }

    @Override
    public void httpAccess(String url) {
        modem.httpAccess(url);
    }
}
