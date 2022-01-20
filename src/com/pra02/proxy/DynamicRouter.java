package com.pra02.proxy;

public class DynamicRouter implements Internet {
    private Internet modern;

    public DynamicRouter() throws Exception {
        this.modern = new Modern("123456");
    }

    @Override
    public void httpAccess(String url) {
        modern.httpAccess(url);
    }
}
