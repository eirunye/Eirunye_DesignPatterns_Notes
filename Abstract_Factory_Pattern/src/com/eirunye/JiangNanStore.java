package com.eirunye;

/**
 * Author Eirunye
 * Created by on 2018/10/12.
 * Describe
 */
public class JiangNanStore extends GourmetStore {


    @Override
    protected GourmetProducts createGourmet(String type) {
        GourmetProducts gourmetProducts = null;
        IAbstractFactory iAbstractFactory = new JiangNanFactory();

        if (type.equals("soup")) {
            gourmetProducts = new ShenzhenCuisine(iAbstractFactory);
            gourmetProducts.setName("汤");
        } else if (type.equals("cooking")) {
            gourmetProducts = new JiangNanCuisine(iAbstractFactory);
            gourmetProducts.setName("红烧排骨");
        }

        return gourmetProducts;
    }
}
