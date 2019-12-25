package com.jason.test.designpattern.factory.factoryMethod.tv;

/**
 * @author ChenHol.Wong
 * @create 2019/12/24 - 21:28
 */
public class HisenseTvFactory implements TVFactory {
    public TV createTV() {
        System.out.println("海信电视生产中.........");
        return new HisenseTV();
    }
}
