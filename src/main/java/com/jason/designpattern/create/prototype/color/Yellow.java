package com.jason.designpattern.create.prototype.color;

/**
 * 黄色-具体原型类
 *
 * @author ChenHol.Wong
 * @create 2020/1/27 13:35
 */
public class Yellow implements Color {
    @Override
    public Object clone() {
        try {
            return (Yellow) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("克隆黄色异常");
            return null;
        }
    }

    @Override
    public void display() {
        System.out.println("这是黄色");
    }
}
