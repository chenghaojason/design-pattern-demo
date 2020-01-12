package com.jason.designpattern.create.factory.simpleFactory;

/**
 * 简单工厂模式-工厂角色
 *
 * @author ADMINISTRATOR
 */
public class Factory {
    private Factory() {
    }

    public static Product createProduct(String type) throws Exception {
        if (null == type || "".equals(type)) {
            throw new Exception("创建对象失败");
        }
        if ("big".equals(type)) {
            return new BigProduct();
        } else if ("small".equals(type)) {
            return new SmallProduct();
        } else {
            throw new Exception("创建对象失败，请选择符合的条件");
        }
    }

}
