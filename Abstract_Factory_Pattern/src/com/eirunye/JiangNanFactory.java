package com.eirunye;

/**
 * Author Eirunye
 * Created by on 2018/10/12.
 * Describe
 */
public class JiangNanFactory implements IAbstractFactory {
    @Override
    public String vegetables() {
        return "江南大白菜";
    }

    @Override
    public String rice() {
        return "杭州香米";
    }

    @Override
    public String meat() {
        return "排骨";
    }
}
