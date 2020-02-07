package com.jason.designpattern.structural.bridge.picture.shape;

/**
 * 扩充抽象类
 * 圆形
 *
 * @author ChenHol.Wong
 * @create 2020/2/7 11:13
 */
public class Circular extends ShapeAbstract {
    @Override
    public void draw() {
        this.color.coloring("圆");
    }
}
