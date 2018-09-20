package com.eirunye.funtion_factory.definite_factory;


import com.eirunye.funtion_factory.character.Meal;
import com.eirunye.funtion_factory.character.MealStore;
import com.eirunye.funtion_factory.definite_propuct.CrayfishMeal;
import com.eirunye.funtion_factory.definite_propuct.RoastDuckMeal;


/**
 * Author Eirunye
 * Created by on 2018/9/18.
 * Describe  JiangNanMealStore分店,这里是需要增加修改的地方，可能有新的菜品的时候就在这里增加或者删除***
 */
public class JiangNanMealStore extends MealStore {


    @Override
    protected Meal createMeal(String type) {
        return getMeal(type);
    }

    private Meal getMeal(String type) {
        if ("crayfish".equals(type)) {
            return new CrayfishMeal();//小龙虾
        } else if ("roastDuck".equals(type)) {
            return new RoastDuckMeal();
        } else return null;
    }
}
