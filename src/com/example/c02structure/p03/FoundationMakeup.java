package com.example.c02structure.p03;

public class FoundationMakeup extends Decorator {
    public FoundationMakeup(Showable showable) {
        super(showable);
    }

    @Override
    public void show() {
        System.out.print("粉底【");
        this.showable.show();
        System.out.print("】");
    }
}
