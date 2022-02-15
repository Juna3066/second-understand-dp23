package com.pra02.memento;

public class Client {
    public static void main(String[] args) {
        Editor editor = new Editor(new Doc("test"));
        editor.append("i ");
        editor.append("love ");
        editor.append("you ");

        //表白误删
        editor.delete();
        //恢复
        editor.undo();
        //算了 这恋爱不适合我 2022年2月15日
        editor.redo();
    }
}
