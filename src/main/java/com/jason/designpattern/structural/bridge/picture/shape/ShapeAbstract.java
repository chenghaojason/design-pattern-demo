package com.jason.designpattern.structural.bridge.picture.shape;

import com.jason.designpattern.structural.bridge.picture.color.Color;

/**
 * 抽象类
 * 形状抽象类
 *
 * @author ChenHol.Wong
 * @create 2020/2/7 10:44
 */
public abstract class ShapeAbstract {
    protected Color color;

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract void draw();
}
