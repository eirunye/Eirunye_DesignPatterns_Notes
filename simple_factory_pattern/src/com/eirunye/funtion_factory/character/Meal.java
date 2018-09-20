package com.eirunye.funtion_factory.character;

import java.util.ArrayList;
import java.util.List;

/**
 * Author Eirunye
 * Created by on 2018/9/18.
 * Describe 抽象产品父类 美食抽象类
 */
public abstract class Meal {

    private String name;

    private String material;

    private String condiment;

   public List mealInfo = new ArrayList();

    public void mealPreparation() {
        System.out.println("您的商品准备中..."+this.name);
        System.out.println("adding material...");
        System.out.println("adding  condiment...");
        System.out.println("adding mealInfo...");

        for (int i = 0, len = mealInfo.size(); i < len; i++) {
            System.out.println(" [" + mealInfo.get(i) + "]");
        }
    }


    public void bake() {
        System.out.println("进行打包,只需1分钟就能打包完成!");

    }

    public void getMeal() {
        System.out.println("外卖小哥获取美食,外卖小哥可能需要花费1~20分钟来获取美食!");
    }

    public void send() {
        System.out.println("配送给客户,配送需要大概5~40分钟送达!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getCondiment() {
        return condiment;
    }

    public void setCondiment(String condiment) {
        this.condiment = condiment;
    }
}
