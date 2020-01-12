package com.jason.designpattern.create.factory.abstractFactory.dy.classes;

import com.jason.designpattern.create.factory.abstractFactory.dy.interfaces.AirConditioner;

/**
 * @author ChenHol.Wong
 * @create 2020/1/2 - 21:31
 */
public class HaierAirConditioner implements AirConditioner {
    @Override
    public void inUse() {
        System.out.println("海尔空调");
    }
}
