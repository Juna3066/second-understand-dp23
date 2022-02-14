package com.pra01.memento;

/**
 * 备忘录类，独立于元数据存在，其维护也独立于元数据
 */
public class History {
    private String body;

    public History(String body) {
        this.body = body;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
