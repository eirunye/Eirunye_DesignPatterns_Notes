package com.eirunye;

public class Main {

    public static void main(String[] args) {

        GourmetStore shenZhenStore = new ShenZhenStore();
        GourmetProducts gourmetProducts = shenZhenStore.orderGourme("soup");
        gourmetProducts.prepareProduct();
        System.out.println(gourmetProducts.toString());

        GourmetStore jiangNanStore = new JiangNanStore();

        GourmetProducts gourmetProducts1 = jiangNanStore.orderGourme("cooking");

        gourmetProducts1.prepareProduct();

        System.out.println(gourmetProducts1.toString());

    }
}
