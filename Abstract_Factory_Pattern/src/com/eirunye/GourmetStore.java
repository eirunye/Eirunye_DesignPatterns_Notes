package com.eirunye;

/**
 * Author Eirunye
 * Created by on 2018/10/12.
 * Describe
 */
public abstract class GourmetStore {

    public GourmetProducts orderGourme(String type) {
        GourmetProducts gourmetProducts;

        gourmetProducts = createGourmet(type);

        return gourmetProducts;
    }

    protected abstract GourmetProducts createGourmet(String type);
}
