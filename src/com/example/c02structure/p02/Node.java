package com.example.c02structure.p02;

/**
 * 文件节点 抽象类
 */
public abstract class Node {
    protected String name;

    public Node(String name) {
        this.name = name;
    }

    protected abstract void add(Node child) throws Exception;

    //我们抽离出所有节点“相同”的部分作为“公有”的代码块,不同的由子类去实现。
    protected void tree(int space){
        for (int i = 0; i < space; i++) {
            System.out.print(" ");
        }
        System.out.println(name);
    }

    //无参重载方法，默认从0列展开显示 格偏移量这个必传参数可能让用户非常困惑，因此创建此方法
    protected void tree(){
        this.tree(0);
    }
}
