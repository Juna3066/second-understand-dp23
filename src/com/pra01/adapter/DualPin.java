package com.pra01.adapter;

/**
 * 二插孔解耦
 */
public interface DualPin {
    /**
     * 通电
     * @param l 火线 live
     * @param n 零线 nuLl
     */
    void electric(int l,int n);
}
