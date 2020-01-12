package com.jason.designpattern.create.factory.abstractFactory.dy.classes;

import com.jason.designpattern.create.factory.abstractFactory.dy.interfaces.AbstractFactory;
import com.jason.designpattern.create.factory.abstractFactory.dy.interfaces.AirConditioner;
import com.jason.designpattern.create.factory.abstractFactory.dy.interfaces.Television;

/**
 * TCL工厂实现类
 *
 * @author ChenHol.Wong
 * @create 2020/1/2 - 21:35
 */
public class TCLFactory implements AbstractFactory {
    @Override
    public Television createTelevision() {
        System.out.println("准备生产TCL电视");
        return new TCLTelevision();
    }

    @Override
    public AirConditioner createAirConditioner() {
        System.out.println("准备生产TCL空调");
        return new TCLAirConditioner();
    }
}
