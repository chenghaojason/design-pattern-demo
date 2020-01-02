package com.jason.designpattern.factory.abstractFactory.dy.interfaces;

/**
 * 抽象工厂
 *
 * @author ChenHol.Wong
 * @create 2020/1/2 - 21:22
 */
public interface AbstractFactory {

    /**
     * 生产电视
     *
     * @return 电视对象
     */
    public Television createTelevision();

    /**
     * 生产空调
     *
     * @return 空调对象
     */
    public AirConditioner createAirConditioner();
}
