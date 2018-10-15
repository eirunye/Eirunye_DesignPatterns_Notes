package com.eirunye;

/**
 * Author Eirunye
 * Created by on 2018/10/12.
 * Describe
 */
public abstract class GourmetProducts {

    String name;
    String vegetables;
    String rice;
    String meat;

    abstract void prepareProduct();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "GourmetProducts{" +
                "name='" + name + '\'' +
                ", vegetables='" + vegetables + '\'' +
                ", rice='" + rice + '\'' +
                ", meat='" + meat + '\'' +
                '}';
    }
}
