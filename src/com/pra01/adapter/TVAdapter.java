package com.pra01.adapter;

public class TVAdapter extends TV implements TriplePin{

    @Override
    public void electric(int l, int n, int e) {
        this.electric(l,n);
    }
}
