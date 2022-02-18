package com.example.c03behavior.p05;

public class NewTrafficLight {
    private State state = new Green();

    public void setState(State state) {
        this.state = state;
    }

    public void toGreen() {
        state.toGreen(this);
    }

    public void toYellow() {
        state.toYellow(this);
    }

    public void toRed() {
        state.toRed(this);
    }
}
