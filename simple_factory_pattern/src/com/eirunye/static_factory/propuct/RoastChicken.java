package com.eirunye.static_factory.propuct;

import com.eirunye.static_factory.character.Meal;

/**
 * Author Eirunye
 * Created by on 2018/9/19.
 * Describe
 */
public class RoastChicken extends Meal{

    public RoastChicken() {
        setName("烧鸡.....");
        setMaterial("添加一份烧鸡+一些适当的材料...");
        setCondiment("添加适量的调味品...");
        mealInfo.add("生成可口的烧鸡...");
    }
}
