package com.pra02.memento;

import java.util.ArrayList;
import java.util.List;

public class Editor {
    private Doc doc;
    //初始化 否则后续add调用空指针异常
    private List<History> historyList = new ArrayList<>();
    private int historyPosition = -1;

    public Editor(Doc doc) {
        System.out.println("<<<载入文档:" + doc.getTitle());
        this.doc = doc;
        backup();
        show();
    }

    public void append(String txt) {
        System.out.println("<<<追加操作");
        doc.setBody(doc.getBody() + txt);
        backup();
        show();
    }

    public void delete() {
        System.out.println("<<<删除操作");
        doc.setBody("");
        backup();
        show();
    }

    public void save() {
        System.out.println("<<<保存操作");
    }

    public void show() {
        System.out.println(doc.getBody());
        System.out.println(">>>文档结束\n");
    }

    public void backup() {
        historyList.add(new History(doc.getBody()));
        historyPosition++;
    }

    public void undo() {
        if (historyPosition == 0) {
            return;
        }
        doc.restoreHistory(historyList.get(--historyPosition));
    }

    public void redo() {
        if (historyPosition == historyList.size() - 1) {
            return;
        }
        //先移动到需要恢复的指针位置 在取值恢复
        doc.restoreHistory(historyList.get(++historyPosition));
    }
}
