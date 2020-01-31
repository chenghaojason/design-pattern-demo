package com.jason.designpattern.create.singleton.dy;

/**
 * 懒汉模式，在getInstance方法上加同步
 *
 * @author ChenHol.Wong
 * @create 2020/1/31 15:32
 */
public class SingletonPatternCheck {
    private static SingletonPatternCheck singletonPatternCheck = null;

    private SingletonPatternCheck() {
    }

    public static synchronized SingletonPatternCheck getInstance() {
        if (singletonPatternCheck == null) {
            singletonPatternCheck = new SingletonPatternCheck();
        }
        return singletonPatternCheck;
    }
}
