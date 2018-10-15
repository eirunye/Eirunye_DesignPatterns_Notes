package com.eirunye;

/**
 * Author Eirunye
 * Created by on 2018/10/12.
 * Describe
 */
public class ShenZhenStore extends GourmetStore {


    @Override
    protected GourmetProducts createGourmet(String type) {
        GourmetProducts gourmetProducts = null;
        IAbstractFactory iAbstractFactory = new ShenZhenFactory();

        if (type.equals("soup")) {
            gourmetProducts = new ShenzhenCuisine(iAbstractFactory);
            gourmetProducts.setName("汤");
        } else if (type.equals("cooking")) {
            gourmetProducts = new JiangNanCuisine(iAbstractFactory);
            gourmetProducts.setName("炒菜");
        }

        return gourmetProducts;
    }
}
