package com.jason.designpattern.create.builder.kfc;

/**
 * KFC套餐-产品者
 *
 * @author ChenHol.Wong
 * @create 2020/1/5 - 22:45
 */
public class Meal {

    private String MealName;//套餐名称
    private String food;// 食物
    private String drink;//饮料

    public String getMealName() {
        return MealName;
    }

    public void setMealName(String mealName) {
        MealName = mealName;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    @Override
    public String toString() {
        return "套餐组成  " +
                "套餐名称:[" + MealName +
                "]\n" + food +
                "\n" + drink + "\n";
    }
}
