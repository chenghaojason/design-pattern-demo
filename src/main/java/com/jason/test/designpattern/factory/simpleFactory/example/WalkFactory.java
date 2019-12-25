package com.jason.test.designpattern.factory.simpleFactory.example;

/**
 * @author ChenHol.Wong
 * @description
 * @create 2019/12/12 - 21:52
 */
public class WalkFactory {
    private WalkFactory() {
    }

    public static AbstractGoToWork createWalk(String type) throws Exception {
        if (null == type || "".equals(type)) {
            throw new Exception("创建对象失败");
        }
        if ("bus".equals(type)) {
            return new ByBusGoToWork();
        } else if ("metro".equals(type)) {
            return new ByMetroGoToWork();
        } else if ("walk".equals(type)) {
            return new ByWalkGoToWork();
        } else {
            throw new Exception("创建对象失败，请选择符合的条件");
        }
    }

}
