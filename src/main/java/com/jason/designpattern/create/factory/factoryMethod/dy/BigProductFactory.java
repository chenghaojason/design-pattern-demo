package com.jason.designpattern.create.factory.factoryMethod.dy;

/**
 * @author ChenHol.Wong
 * @create 2019/12/23 - 21:50
 */
public class BigProductFactory extends AbstractFactory {
    public AbstractProduct createProductFactory() {
        return new BigProduct();
    }
}
