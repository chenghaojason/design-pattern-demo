package com.jason.designpattern.create.builder.kfc;

/**
 * @author ChenHol.Wong
 * @create 2020/1/5 - 22:56
 */
public class MealBuilderA extends MealBuilder {
    @Override
    public void buildName() {
        meal.setMealName("香辣鸡腿堡套餐");
    }

    @Override
    public void buildFood() {
        meal.setFood("香辣鸡腿堡");
    }

    @Override
    public void buildDrink() {
        meal.setDrink("可口可乐");
    }
}
