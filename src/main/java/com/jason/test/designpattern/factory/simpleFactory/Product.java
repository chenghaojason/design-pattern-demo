package com.jason.test.designpattern.factory.simpleFactory;

/**
 * @author ChenHol.Wong
 * @Description 简单工厂模式-抽象产品角色
 * @create 2019/12/12 - 21:28
 */
public abstract class Product {

    private String name ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
