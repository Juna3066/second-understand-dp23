package com.example.c03behavior.p10.optimization;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private String product;
    private List<Buyer> buyerList;

    public Shop() {
        this.product = "无商品";
        this.buyerList = new ArrayList<>();
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
        //主动推送
        notifyBuyers();
    }

    public void register(Buyer buyer) {
        this.buyerList.add(buyer);
    }

    public void notifyBuyers() {
        //此处假设商品不限量
        buyerList.stream().forEach(buyer -> buyer.inform(this.product));
    }
}
