package com.pra02.decorator;

/**
 * 装饰器抽象类 组件实现
 * 并且 组合组件
 */
public abstract class Decorator implements Showable {
    protected Showable showable;

    public Decorator(Showable showable) {
        this.showable = showable;
    }

    @Override
    public void show() {
        showable.show();
    }
}
