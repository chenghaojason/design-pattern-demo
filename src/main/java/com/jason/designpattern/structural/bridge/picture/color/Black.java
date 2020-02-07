package com.jason.designpattern.structural.bridge.picture.color;

/**
 * @author ChenHol.Wong
 * @create 2020/2/7 10:41
 */
public class Black implements Color {
    @Override
    public void coloring(String shapeType) {
        System.out.println("绘制：黑色的" + shapeType + " 图片");
    }
}
