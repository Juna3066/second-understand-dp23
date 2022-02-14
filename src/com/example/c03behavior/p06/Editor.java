package com.example.c03behavior.p06;

import javax.swing.undo.UndoableEdit;
import java.util.ArrayList;
import java.util.List;

public class Editor {
    private Doc doc;

    //历史记录列表
    private List<History> historyRecords;
    //当前历史记录位置
    private int historyPosition = -1;

    public Editor(Doc doc) {
        System.out.println("<<<打开文档" + doc.getTitle());
        this.doc = doc;
        //初始化历史记录列表
        historyRecords = new ArrayList<>();
        //载入文档后保存第一份历史记录
        backup();
        show();
    }

    public void append(String txt) {
        System.out.println("<<<插入操作");
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
        System.out.println("<<<存盘操作");
    }

    public void show() {
        System.out.println(doc.getBody());
        System.out.println("文档结束>>>\n");
    }


    private void backup() {
        historyRecords.add(doc.createHistory());
        historyPosition++;
    }

    /**
     * 撤销操作
     */
    public void undo() {
        System.out.println(">>>撤销操作");
        if (historyPosition == 0) {
            return;
        }
        historyPosition--;
        History history = historyRecords.get(historyPosition);
        doc.restoreHistory(history);
        show();
    }

    /**
     * 重做操作
     */
    public void redo() {

    }

}
