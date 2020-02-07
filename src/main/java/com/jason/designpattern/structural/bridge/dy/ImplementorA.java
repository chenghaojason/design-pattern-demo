package com.jason.designpattern.structural.bridge.dy;

/**
 * 具体实现类
 *
 * @author ChenHol.Wong
 * @create 2020/2/7 10:18
 */
public class ImplementorA implements Implementor {
    @Override
    public void operationImpl() {
        System.out.println("具体实现类A");
    }
}
