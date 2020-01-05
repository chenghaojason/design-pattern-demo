package com.jason.designpattern.builder.kfc;

/**
 * @author ChenHol.Wong
 * @create 2020/1/5 - 22:57
 */
public class MealBuilderB extends MealBuilder {
    @Override
    public void buildName() {
        meal.setMealName("超级豪华套餐");
    }

    @Override
    public void buildFood() {
        meal.setFood("双层牛肉麻辣鸡排汉堡+全家桶");
    }

    @Override
    public void buildDrink() {
        meal.setDrink("可口可乐+双皮奶+王老吉");
    }
}
