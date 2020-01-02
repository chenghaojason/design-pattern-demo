package com.jason.designpattern.factory.abstractFactory.dy.classes;

import com.jason.designpattern.factory.abstractFactory.dy.interfaces.AbstractFactory;
import com.jason.designpattern.factory.abstractFactory.dy.interfaces.AirConditioner;
import com.jason.designpattern.factory.abstractFactory.dy.interfaces.Television;

/**
 * 海尔工厂实现类
 *
 * @author ChenHol.Wong
 * @create 2020/1/2 - 21:32
 */
public class HaierFactory implements AbstractFactory {
    @Override
    public Television createTelevision() {
        System.out.println("准备生产海尔电视");
        return new HaierTelevision();
    }

    @Override
    public AirConditioner createAirConditioner() {
        System.out.println("准备生产海尔空调");
        return new HaierAirConditioner();
    }
}
