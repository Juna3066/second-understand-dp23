package com.pra02.decorator;

public class Lipstick extends Decorator{
    public Lipstick(Showable showable) {
        super(showable);
    }

    @Override
    public void show() {
        System.out.print("lipstick[");
        super.show();
        System.out.print("]");
    }
}
