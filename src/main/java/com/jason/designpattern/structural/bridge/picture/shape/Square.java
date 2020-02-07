package com.jason.designpattern.structural.bridge.picture.shape;

/**
 * 扩充抽象类
 * 正方形
 *
 * @author ChenHol.Wong
 * @create 2020/2/7 11:11
 */
public class Square extends ShapeAbstract {
    @Override
    public void draw() {
        this.color.coloring("正方形");
    }
}
