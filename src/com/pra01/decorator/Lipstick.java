package com.pra01.decorator;

public class Lipstick extends Decorator{

    public Lipstick(Showable showable) {
        super(showable);
    }

    @Override
    public void show() {
        System.out.print("口红【");
        showable.show();
        System.out.print("】");
    }
}
