package com.eirunye.funtion_factory.character;

/**
 * Author Eirunye
 * Created by on 2018/9/18.
 * Describe 抽象工厂父类 美食总店
 */
public abstract class MealStore {

    /**
     * 客户下单
     *
     * @param type 选择什么样的美食
     * @return 美食 Meal
     */
    public Meal submitOrderMeal(String type) {

        Meal meal;

        //这里是我们将生产的美食
        meal = createMeal(type);

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

    //实现抽象的工厂方法，让每个分店来完成此生产操作，
    protected abstract Meal createMeal(String type);

}
