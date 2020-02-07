package com.jason.designpattern.structural.bridge.dy;

/**
 * 桥接模式
 * 抽象类
 *
 * @author ChenHol.Wong
 * @create 2020/2/7 10:19
 */
public abstract class Abstraction {
    protected Implementor implementor;

    public void setImplementor(Implementor implementor) {
        this.implementor = implementor;
    }

    public abstract void operation();
}
