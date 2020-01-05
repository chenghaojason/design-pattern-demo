package com.jason.designpattern.builder.kfc;

/**
 * KFC套餐生产过程-抽象建造者
 *
 * @author ChenHol.Wong
 * @create 2020/1/5 - 22:49
 */
public abstract class MealBuilder {

    protected Meal meal = new Meal();

    public abstract void buildName();

    public abstract void buildFood();

    public abstract void buildDrink();

    public Meal getMeal() {
        return meal;
    }
}
