package com.jason.designpattern.structural.bridge.picture.color;

/**
 * @author ChenHol.Wong
 * @create 2020/2/7 10:39
 */
public class Red implements Color {
    @Override
    public void coloring(String shapeType) {
        System.out.println("绘制：红色的" + shapeType + " 图片");
    }
}
