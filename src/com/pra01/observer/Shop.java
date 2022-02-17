package com.pra01.observer;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private String product;
    private List<Buyer> buyerList;

    public Shop() {
        this.product = "无商品";
        buyerList = new ArrayList<>();
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
        notifyBuyers();
    }

    //观察者 注册到列表
    public void register(Buyer buyer) {
        buyerList.add(buyer);
    }

    //主题 消息推送 到注册的观察者列表
    public void notifyBuyers() {
        buyerList.forEach(buyer -> buyer.inform(this.product));
    }
}
