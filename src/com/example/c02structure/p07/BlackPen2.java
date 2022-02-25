package com.example.c02structure.p07;

public class BlackPen2 extends Pen2 {
    public BlackPen2(Ruler ruler) {
        super(ruler);
    }

    @Override
    public void draw() {
        System.out.print("黑");
        this.ruler.regularize();
    }
}
