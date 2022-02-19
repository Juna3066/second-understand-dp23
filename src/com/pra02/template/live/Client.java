package com.pra02.template.live;

public class Client {
    public static void main(String[] args) {
        Mammal mammal = new Human();
        mammal.live();
        mammal = new Bat();
        mammal.live();
        mammal = new Whale();
        mammal.live();
    }
}
