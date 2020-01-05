package com.jason.designpattern.builder.kfc;

/**
 * KFC服务员-指挥者
 *
 * @author ChenHol.Wong
 * @create 2020/1/5 - 22:53
 */
public class KFCWaiter {
    private MealBuilder builder;

    public void setBuilder(MealBuilder builder) {
        this.builder = builder;
    }

    public Meal construct() {
        builder.buildName();
        builder.buildFood();
        builder.buildDrink();
        return builder.getMeal();
    }
}
