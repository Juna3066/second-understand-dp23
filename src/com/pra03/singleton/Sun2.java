package com.pra03.singleton;

public class Sun2 {
    private static volatile Sun2 sun = null;

    private Sun2() {
    }

/*    public static Sun2 getInstance() {
        if (sun == null) {
            sun = new Sun2();
        }
        return sun;
    }*/

    public static synchronized Sun2 getInstance() {
        if (sun == null) {
            synchronized (Sun2.class) {
                if (sun == null) {
                    sun = new Sun2();
                }
            }
        }
        return sun;
    }

}
