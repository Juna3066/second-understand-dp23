package com.example.c02structure.p02;

import java.util.ArrayList;
import java.util.List;

public class Folder extends Node{
    //文件夹可以包含子节点
    private List<Node> childrenNodes = new ArrayList<>();

    public Folder(String name) {
        super(name);
    }

    @Override
    protected void add(Node child) {
        this.childrenNodes.add(child);
    }

    //重写父类方法
    @Override
    protected void tree(int space) {
        super.tree(space);
        space++;
        for (Node node : childrenNodes) {
            node.tree(space);
        }
    }
}
