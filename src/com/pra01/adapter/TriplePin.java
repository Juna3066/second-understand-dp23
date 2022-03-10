package com.pra01.adapter;

/**
 * 三插接口
 */
public interface TriplePin {
    /**
     * 通电
     * @param l 火线 live
     * @param n 零线 nuLl
     * @param e 地线 earth
     */
    void electric(int l,int n,int e);
}
