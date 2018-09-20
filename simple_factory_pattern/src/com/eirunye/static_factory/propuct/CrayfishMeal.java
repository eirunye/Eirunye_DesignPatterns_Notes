package com.eirunye.static_factory.propuct;

import com.eirunye.static_factory.character.Meal;

/**
 * Author Eirunye
 * Created by on 2018/9/19.
 * Describe 模拟产品(具体的美食--小龙虾)
 */
public class CrayfishMeal extends Meal {
    public CrayfishMeal() {
        setName("香辣小龙虾.....");
        setMaterial("添加5份小龙虾...");
        setCondiment("添加适量的调味品...");
        mealInfo.add("生成可口的小龙虾...");
    }
}
