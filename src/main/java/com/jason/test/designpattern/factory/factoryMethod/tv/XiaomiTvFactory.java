package com.jason.test.designpattern.factory.factoryMethod.tv;

/**
 * @author ChenHol.Wong
 * @create 2019/12/24 - 21:29
 */
public class XiaomiTvFactory implements TVFactory {
    public TV createTV() {
        System.out.println("小米电视也在生产.....");
        return new XiaomiTV();
    }
}
