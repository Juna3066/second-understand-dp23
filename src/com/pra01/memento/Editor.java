package com.pra01.memento;

import java.util.ArrayList;
import java.util.List;

public class Editor {
    private Doc doc;
    private List<History> histories = new ArrayList<>();
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
        histories.add(doc.createHistory());
        historyPosition++;
    }

    public void undo() {
        System.out.println("<<<撤销操作");
        if (historyPosition == 1) {
            return;
        }
        doc.restoreHistory(histories.get(--historyPosition));
        show();
    }

    public void redo() {
        System.out.println("<<<取消撤销操作");
        //防止数组索引越界
        if(historyPosition==histories.size()-1){
            return;
        }
        doc.restoreHistory(histories.get(++historyPosition));
        show();
    }
}
