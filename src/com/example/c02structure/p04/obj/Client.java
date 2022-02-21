package com.example.c02structure.p04.obj;

public class Client {
    public static void main(String[] args) {
        //家里装修的是三插口 电视是二插口
        //TriplePin tv = new TV();
        TV tv = new TV();
        TriplePin adapter = new Adapter(tv);
        adapter.electrify(1, 0, -1);
    }
}
