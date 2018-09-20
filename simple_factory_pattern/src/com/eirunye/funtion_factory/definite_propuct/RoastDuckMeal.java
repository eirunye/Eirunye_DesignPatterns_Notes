package com.eirunye.funtion_factory.definite_propuct;

import com.eirunye.funtion_factory.character.Meal;

/**
 * Author Eirunye
 * Created by on 2018/9/18.
 * Describe 具体产品 烤鸭美食
 */
public class RoastDuckMeal extends Meal {

    public RoastDuckMeal() {
        setName("江南烤鸭.....");
        setMaterial("添加几份烤鸭+一些材料...");
        setCondiment("添加适量的调味品...");
        mealInfo.add("生成可口的烤鸭...");
    }
}
