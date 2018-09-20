package com.eirunye.static_factory.character;

import com.eirunye.static_factory.character.Meal;
import com.eirunye.static_factory.factory.SimpleMealsFactory;
import com.eirunye.static_factory.propuct.CrayfishMeal;
import com.eirunye.static_factory.propuct.RoastChicken;

/**
 * Author Eirunye
 * Created by on 2018/9/19.
 * Describe
 */
public class MealStore {


    public Meal submitOrderMeal(String type) {

        Meal meal;

//我们将其提取到静态工厂方法中
//        if ("crayfish".equals(type)) {
//            meal = new CrayfishMeal();
//        } else if ("roastChicken".equals(type)) {
//            meal = new RoastChicken();
//        } else if ("".equals(type)) {
//
//        } else if ("".equals(type)) {
//
//        }

        //利用静态工厂方法生成产品
        //重点(静态工厂实现代码)
        meal = SimpleMealsFactory.createMeal(type);

        //以下方法是进行一些设计而已不是静态工厂方法的模块，是产品的一些操作而已，无关紧要的
        //店家准备中...
        meal.mealPreparation();
        //打包
        meal.bake();
        //获取
        meal.getMeal();
        //配送
        meal.send();

        return meal;
    }
}
