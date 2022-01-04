package com.pra01.decorator;

public abstract class Decorator implements Showable{
    protected Showable showable;
    public Decorator(Showable showable){
        this.showable = showable;
    }
    @Override
    public void show() {
        showable.show();
    }
}
