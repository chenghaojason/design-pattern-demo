package com.jason.designpattern.structural.bridge.dy;

/**
 * 扩充抽象类
 *
 * @author ChenHol.Wong
 * @create 2020/2/7 10:21
 */
public class RefinedAbstraction extends Abstraction {
    @Override
    public void operation() {
        implementor.operationImpl();
    }
}
