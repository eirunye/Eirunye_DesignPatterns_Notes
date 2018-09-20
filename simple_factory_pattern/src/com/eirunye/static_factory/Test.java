package com.eirunye.static_factory;

import com.eirunye.static_factory.character.MealStore;

/**
 * Author Eirunye
 * Created by on 2018/9/19.
 * Describe
 */
public class Test {
    public static void main(String[] args) {

        //创建一个工厂类
        MealStore mealStore = new MealStore();

        mealStore.submitOrderMeal("roastChicken");

    }


}
