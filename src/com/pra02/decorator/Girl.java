package com.pra02.decorator;

/**
 * 组件实现
 */
public class Girl implements Showable{
    @Override
    public void show() {
        System.out.print("original face");
    }
}
