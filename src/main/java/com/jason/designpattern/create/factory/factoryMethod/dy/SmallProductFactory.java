package com.jason.designpattern.create.factory.factoryMethod.dy;

/**
 * @author ChenHol.Wong
 * @create 2019/12/24 - 20:47
 */
public class SmallProductFactory extends AbstractFactory {
    public AbstractProduct createProductFactory() {
        return new SmallProduct();
    }
}
