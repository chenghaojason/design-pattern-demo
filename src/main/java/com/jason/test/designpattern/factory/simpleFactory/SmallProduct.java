package com.jason.test.designpattern.factory.simpleFactory;

/**
 * @author ChenHol.Wong
 * @description 简单工厂模式-产品2
 * @create 2019/12/12 - 21:34
 */
public class SmallProduct extends Product {
    private String price;

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
