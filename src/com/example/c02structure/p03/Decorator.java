package com.example.c02structure.p03;

//abstract 表示不能直接被实例化
public abstract class Decorator implements Showable {
    protected Showable showable;

    public Decorator(Showable showable) {
        this.showable = showable;
    }

    //此处完全可以不用实现 只是为了看着直接方方便
    @Override
    public void show() {
        showable.show();
    }
}
