package com.eirunye.static_factory.factory;


import com.eirunye.static_factory.character.Meal;
import com.eirunye.static_factory.propuct.CrayfishMeal;
import com.eirunye.static_factory.propuct.RoastChicken;

/**
 * Author Eirunye
 * Created by on 2018/9/18.
 * Describe 建立一个简单工厂，该工厂生产不同的菜品（美食）
 * Tip: 提示：这是不是我们经常使用的Util类的编写方式?
 */
public class SimpleMealsFactory {

    //将生产产品（美食放在这里）
    public static Meal createMeal(String type) {

        Meal meal = null;

        if ("crayfish".equals(type)) {
            meal = new CrayfishMeal(); //创建什么类型的产品(美食)让子类来操作
        } else if ("roastChicken".equals(type)) {
            meal = new RoastChicken();
        } else if ("".equals(type)) {

        } else if ("".equals(type)) {

        }
        // ...
        return meal;
    }

}
