package com.jason.designpattern.create.prototype.color;

/**
 * 红色-具体原型类
 *
 * @author ChenHol.Wong
 * @create 2020/1/27 13:30
 */
public class Red implements Color {
    @Override
    public Object clone() {
        try {
            return (Red) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("克隆红色异常");
            return null;
        }
    }

    @Override
    public void display() {
        System.out.println("显示红色");
    }
}
