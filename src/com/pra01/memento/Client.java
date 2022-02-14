package com.pra01.memento;

public class Client {
    public static void main(String[] args) {
        Editor editor = new Editor(new Doc("面试总结"));
        editor.append("1.基础知识\n\t...\n");
        editor.append("2.Web知识\n\t...\n");
        editor.append("3.基础框架知识\n\t...\n");
        //editor.append("4.微服务相关知识\n\t...\n");

        editor.delete();

        editor.undo();
    }
}
