package com.jason.designpattern.create.builder.dy;

/**
 * 指挥者
 *
 * @author ChenHol.Wong
 * @create 2020/1/5 - 22:08
 */
public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public Product construct() {
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
        return builder.getResult();
    }
}
