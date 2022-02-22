package com.pra03.proxy;

public class Switch implements Intranet {

    @Override
    public void fileAccess(String filePath) {
        System.out.println("内网访问：" + filePath);
    }
}
