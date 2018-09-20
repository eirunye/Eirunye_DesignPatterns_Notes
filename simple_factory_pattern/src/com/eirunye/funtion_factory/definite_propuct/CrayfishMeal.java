package com.eirunye.funtion_factory.definite_propuct;

import com.eirunye.funtion_factory.character.Meal;

/**
 * Author Eirunye
 * Created by on 2018/9/18.
 * Describe 具体产品 小龙虾美食
 */
public class CrayfishMeal extends Meal {

    public CrayfishMeal() {
        setName("可口的小龙虾.....");
        setMaterial("添加几份小龙虾+一些材料...");
        setCondiment("添加适量的调味品...");
        mealInfo.add("生成可口的小龙虾...");
    }

    //这里重写了父类的方法
    @Override
    public void bake() {
        System.out.println("小龙虾分成5粉打包!");
    }
}
