package com.jason.designpattern.create.prototype.deepclone;

import java.io.Serializable;

/**
 * 深克隆-抽象原型类-汽车
 *
 * @author ChenHol.Wong
 * @create 2020/1/31 14:31
 */
public abstract class Car implements Serializable {
    public double height;//重量 单位吨
    public String color;//颜色
    public int number;//生产数量
    public Engine engine;//发动机

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    protected abstract Object clone();

    protected abstract void run();

}
