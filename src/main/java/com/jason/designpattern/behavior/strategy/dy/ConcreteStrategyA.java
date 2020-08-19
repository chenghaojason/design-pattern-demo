package com.jason.designpattern.behavior.strategy.dy;

/**
 * @author ChenHol.Wong
 * @create 2020/8/15 16:50
 */
public class ConcreteStrategyA extends AbstractStrategy {
    @Override
    public void algorithm() {
        System.out.println("具体策略-策略A");
    }
}
