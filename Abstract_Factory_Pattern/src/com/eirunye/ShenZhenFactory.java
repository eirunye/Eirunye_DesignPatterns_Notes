package com.eirunye;

import com.eirunye.IAbstractFactory;

/**
 * Author Eirunye
 * Created by on 2018/10/12.
 * Describe
 */
public class ShenZhenFactory implements IAbstractFactory {
    @Override
    public String vegetables() {
        return "深圳白菜";
    }

    @Override
    public String rice() {
        return "深圳香米";
    }

    @Override
    public String meat() {
        return "深圳五花肉";
    }
}
