package com.example.c02structure.p06.intranet;

public class Switch implements Intranet {

    @Override
    public void fileAccess(String path) {
        System.out.println("访问内网" + path);
    }
}
