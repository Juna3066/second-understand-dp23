package com.example.c02structure.p03;

public class FoundationMakeup extends Decorator {
    public FoundationMakeup(Showable showable) {
        super(showable);
    }

    @Override
    public void show() {
        System.out.print("η²εΊγ");
        this.showable.show();
        System.out.print("γ");
    }
}
