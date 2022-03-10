package com.pra02.decorator;

public class FoundationMakeup extends Decorator {

    public FoundationMakeup(Showable showable) {
        super(showable);
    }

    @Override
    public void show() {
        System.out.print("foundationMakeup[");
        super.show();
        System.out.print("]");
    }

}
