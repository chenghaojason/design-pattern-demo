package com.jason.designpattern.behavior.strategy.dy;

/**
 * 环境类
 *
 * @author ChenHol.Wong
 * @create 2020/8/15 16:51
 */
public class Context {
    private AbstractStrategy abstractStrategy;

    public void setAbstractStrategy(AbstractStrategy abstractStrategy) {
        this.abstractStrategy = abstractStrategy;
    }

    public void algorithm() {
        abstractStrategy.algorithm();
    }
}
