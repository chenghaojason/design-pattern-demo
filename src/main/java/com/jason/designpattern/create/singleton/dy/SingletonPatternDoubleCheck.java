package com.jason.designpattern.create.singleton.dy;

/**
 * 懒汉模式，双重检查锁定
 *
 * @author ChenHol.Wong
 * @create 2020/1/31 15:35
 */
public class SingletonPatternDoubleCheck {
    private static SingletonPatternDoubleCheck doubleCheck = null;

    private SingletonPatternDoubleCheck() {
    }

    public static SingletonPatternDoubleCheck getInstance() {
        if (doubleCheck == null) {
            synchronized (SingletonPatternDoubleCheck.class) {
                if (doubleCheck == null) {
                    doubleCheck = new SingletonPatternDoubleCheck();
                }
            }
        }
        return doubleCheck;
    }
}
