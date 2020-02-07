package com.jason.designpattern.structural.bridge.picture.color;

/**
 * 实现类接口
 * 颜色接口
 *
 * @author ChenHol.Wong
 * @create 2020/2/7 10:36
 */
public interface Color {

    /**
     * 绘制所需的图形
     *  @param shapeType 形状类型
     *
     */
    void coloring(String shapeType);
}
