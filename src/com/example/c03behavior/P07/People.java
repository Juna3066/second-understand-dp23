package com.example.c03behavior.P07;

public class People {
    private String name;
    //持有对方的引用
    private People other;

    public People(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void connect(People other) {
        //注入对方的对象
        this.other = other;
    }

    private void listen(String msg) {
        System.out.printf("%s 对 %s 说：\t%s\n", other.getName(), this.name, msg);
    }

    public void talk(String msg) {
        other.listen(msg);
    }

}
