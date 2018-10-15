package com.eirunye;

/**
 * Author Eirunye
 * Created by on 2018/10/12.
 * Describe
 */
public class JiangNanCuisine extends GourmetProducts {

    IAbstractFactory iAbstractFactory;

    public JiangNanCuisine(IAbstractFactory iAbstractFactory) {
    this.iAbstractFactory = iAbstractFactory;
}

    @Override
    void prepareProduct() {
        System.out.println("进行中..." + name);
        vegetables = iAbstractFactory.vegetables();
        rice = iAbstractFactory.rice();
        meat = iAbstractFactory.meat();
    }
}
