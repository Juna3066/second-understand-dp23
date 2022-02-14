package com.example.c03behavior.p06;

public class Client {
    public static void main(String[] args) {
        Editor editor = new Editor(new Doc("设计模式"));

        editor.append("第一张：概述\n\t正文100字...\n");
        editor.append("第二章：创建篇\n\t正文600字...\n");
        editor.append("第三章：结构篇\n\t正文700字...\n");
        editor.append("第四章：行为篇\n\t正文900字...\n");
        editor.append("第五章：软件设计原则篇\n\t正文300字...\n");
        //误删除
        editor.delete();

        editor.undo();
    }
}
