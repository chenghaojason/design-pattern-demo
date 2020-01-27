package com.jason.designpattern.create.prototype.color;

/**
 * 绿色-具体原型类
 *
 * @author ChenHol.Wong
 * @create 2020/1/27 13:34
 */
public class Green implements Color {
    @Override
    public Object clone() {
        try {
            return (Green) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("克隆绿色异常");
            return null;
        }
    }

    @Override
    public void display() {
        System.out.println("这是绿色");
    }
}
