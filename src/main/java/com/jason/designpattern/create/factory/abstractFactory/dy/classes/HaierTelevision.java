package com.jason.designpattern.create.factory.abstractFactory.dy.classes;

import com.jason.designpattern.create.factory.abstractFactory.dy.interfaces.Television;

/** 海尔电视
 * @author ChenHol.Wong
 * @create 2020/1/2 - 21:30
 */
public class HaierTelevision implements Television {
    @Override
    public void play() {
        System.out.println("海尔电视");
    }
}
