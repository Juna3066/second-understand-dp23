package com.example.c02structure.p01;

public class Client {
    public void eat() {
        System.out.println("开始用餐...");
    }

    public void wash() {
        System.out.println("洗碗...");
    }

    public static void main(String[] args) {
        //demo();
        Facade hall = new Facade();
        hall.order();

    }

    /**
     * 代码不复杂，但是吃一顿饭 竟然四方
     */
    private static void demo() {
        VegVendor vegVendor = new VegVendor();
        vegVendor.purchase();
        Helper helper = new Helper();
        helper.cook();
        Client client = new Client();
        client.eat();
        client.wash();
    }
}
