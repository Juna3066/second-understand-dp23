package com.pra01.decorator;

public class FoundationMakeup extends Decorator{
    public FoundationMakeup(Showable showable) {
        super(showable);
    }

    @Override
    public void show() {
        System.out.print("粉底【");
        showable.show();
        System.out.print("】");
    }
}
