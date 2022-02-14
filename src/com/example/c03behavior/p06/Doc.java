package com.example.c03behavior.p06;

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

    /**
     * 创建历史记录
     * @return
     */
    public History createHistory() {
        return new History(body);
    }

    /**
     * 恢复历史记录
     * @param history
     */
    public void restoreHistory(History history) {
        this.body = history.getBody();
    }
}
