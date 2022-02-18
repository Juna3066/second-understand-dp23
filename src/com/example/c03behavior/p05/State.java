package com.example.c03behavior.p05;

public interface State {
    void toGreen(NewTrafficLight light);

    void toYellow(NewTrafficLight light);

    void toRed(NewTrafficLight light);
}
