package com.jason.designpattern.structural.Decorator.dy;

/**
 * 汽车-具体构件类
 *
 * @author ChenHol.Wong
 * @create 2020/8/4 22:42
 */
public final class Car implements TransForm {

    public Car() {
        System.out.println("变形金刚是一辆车");
    }

    @Override
    public void move() {
        System.out.println("汽车在跑");
    }
}
