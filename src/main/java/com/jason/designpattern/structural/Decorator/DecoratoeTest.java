package com.jason.designpattern.structural.Decorator;

import com.jason.designpattern.structural.Decorator.dy.Car;
import com.jason.designpattern.structural.Decorator.dy.Robot;
import com.jason.designpattern.structural.Decorator.dy.TransForm;

/**
 * @author ChenHol.Wong
 * @create 2020/8/4 22:49
 */
public class DecoratoeTest {
    public static void main(String[] args) {
        // 基础定义测试
        TransForm car = new Car();
        car.move();
        System.out.println("----------------------");
        Robot robot = new Robot(car);
        robot.move();
        robot.say();
    }
}
