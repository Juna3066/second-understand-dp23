package com.pra01.decorator;

public class FoundationMakeup extends Decorator{
    public FoundationMakeup(Showable showable) {
        super(showable);
    }

    @Override
    public void show() {
        System.out.print("η²εΊγ");
        showable.show();
        System.out.print("γ");
    }
}
