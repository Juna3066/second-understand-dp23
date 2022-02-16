package com.pra01.mediator;

public class People {
    private String name;
    private People other;

    public People(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void connection(People other) {
        //注入听话人
        this.other = other;
    }

    public void listen(String msg) {
        System.out.printf("%s 对 %s 说：%s\n", other.getName(), name, msg);
    }

    public void talk(String msg) {
        //我讲你听，听的方法打印输出
        other.listen(msg);
    }
}
