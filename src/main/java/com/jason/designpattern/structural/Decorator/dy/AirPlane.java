package com.jason.designpattern.structural.Decorator.dy;

/**
 * 飞机-具体装饰类
 *
 * @author ChenHol.Wong
 * @create 2020/8/4 22:47
 */
public class AirPlane extends Change {

    public AirPlane(TransForm transForm) {
        super(transForm);
        System.out.println("变成了飞机");
    }

    public void fly() {
        System.out.println("在天空中飞~~~~~~~~~");
    }
}
