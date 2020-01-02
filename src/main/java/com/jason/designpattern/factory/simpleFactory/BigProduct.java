package com.jason.designpattern.factory.simpleFactory;

/**
 * @author ChenHol.Wong
 * @description 简单工厂模式-产品1
 * @create 2019/12/12 - 21:33
 */
public class BigProduct extends Product {

    private String property;// 属性

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }
}
