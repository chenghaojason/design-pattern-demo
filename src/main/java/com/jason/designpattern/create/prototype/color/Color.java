package com.jason.designpattern.create.prototype.color;

/**
 * 颜色-抽象原型类
 *
 * @author ChenHol.Wong
 * @create 2020/1/27 13:27
 */
public interface Color extends Cloneable {
    Object clone();

    void display();
}
