package com.pra01.memento;

public class Doc {
    private String title;
    private String body;

    public Doc(String title) {
        this.title = title;
        this.body = "";
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    //文档关于历史的创建操作
    public History createHistory() {
        return new History(body);
    }
    //文档关于历史的载入操作
    public void restoreHistory(History history) {
        body = history.getBody();
    }

}
