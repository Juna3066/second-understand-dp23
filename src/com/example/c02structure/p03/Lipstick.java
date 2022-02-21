package com.example.c02structure.p03;

public class Lipstick extends Decorator{
    public Lipstick(Showable showable) {
        super(showable);
    }

    @Override
    public void show() {
        System.out.print("口红【");
        this.showable.show();
        System.out.print("】");
    }
}
