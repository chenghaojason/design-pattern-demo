package com.jason.designpattern.structural.Composite.warehouse;

/**
 * 物品
 * 抽象构件类
 * 安全组合模式
 *
 * @author ChenHol.Wong
 * @create 2020/2/8 19:45
 */
public abstract class Things {
    public Things(String name) {
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * 使用物品
     */
    public abstract void use();
}
