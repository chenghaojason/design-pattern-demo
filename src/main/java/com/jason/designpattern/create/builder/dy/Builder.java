package com.jason.designpattern.create.builder.dy;

/**
 * 抽象建造者
 *
 * @author ChenHol.Wong
 * @create 2020/1/5 - 22:04
 */
public abstract class Builder {
    protected Product product = new Product();

    public abstract void buildPartA();

    public abstract void buildPartB();

    public abstract void buildPartC();

    public Product getResult() {
        return product;
    }
}
