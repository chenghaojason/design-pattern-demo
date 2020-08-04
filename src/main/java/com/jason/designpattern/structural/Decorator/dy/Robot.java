package com.jason.designpattern.structural.Decorator.dy;

/**
 * 机器人类-具体装饰类
 *
 * @author ChenHol.Wong
 * @create 2020/8/4 22:46
 */
public class Robot extends Change {

    public Robot(TransForm transForm) {
        super(transForm);
        System.out.println("变成了机器人");
    }

    public void say() {
        System.out.println("机器人在说话");
    }
}
