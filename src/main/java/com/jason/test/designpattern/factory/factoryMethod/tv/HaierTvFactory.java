package com.jason.test.designpattern.factory.factoryMethod.tv;

/**
 * @author ChenHol.Wong
 * @create 2019/12/24 - 21:27
 */
public class HaierTvFactory implements TVFactory {
    public TV createTV() {
        System.out.println("努力制造海信电视机...............");
        return new HaierTV();
    }
}
