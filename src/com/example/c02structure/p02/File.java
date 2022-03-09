package com.example.c02structure.p02;

public class File extends Node {
    public File(String name) {
        super(name);
    }

    @Override
    protected void add(Node child) throws Exception {
        //System.out.println("不能添加子节点了");
        //抛出异常，更好的保证逻辑的正确性。外部捕获异常，做出相应处理
        throw new Exception("notAllowed");
    }

//    //直接继承父类，此处可以不用写
//    @Override
//    protected void tree(int space) {
//        super.tree(space);
//    }
}
