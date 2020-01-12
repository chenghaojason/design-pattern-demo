package com.jason.designpattern.create.factory.abstractFactory.dy.classes;

import com.jason.designpattern.create.factory.abstractFactory.dy.interfaces.AirConditioner;

/**
 * @author ChenHol.Wong
 * @create 2020/1/2 - 21:32
 */
public class TCLAirConditioner implements AirConditioner {
    @Override
    public void inUse() {
        System.out.println("TCL空调");
    }
}
