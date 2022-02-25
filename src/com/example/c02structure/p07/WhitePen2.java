package com.example.c02structure.p07;

public class WhitePen2 extends Pen2 {
    public WhitePen2(Ruler ruler) {
        super(ruler);
    }

    @Override
    public void draw() {
        System.out.print("白");
        this.ruler.regularize();
    }
}
