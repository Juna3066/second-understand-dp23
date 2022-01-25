package com.pra03.singleton;

public class Sun {
    private static final Sun sun = new Sun();

    private Sun() {}

    public static Sun getInstance() {
        return sun;
    }
}
