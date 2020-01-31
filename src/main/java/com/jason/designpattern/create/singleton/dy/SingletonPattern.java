package com.jason.designpattern.create.singleton.dy;

/**
 * 单例模式的简单使用
 * 懒汉式单例模式：（非线程安全）
 *
 * @author ChenHol.Wong
 * @create 2020/1/31 15:12
 */
public class SingletonPattern {

    private static SingletonPattern singletonPattern = null;//私有的静态成员变量

    // 私有构造函数
    private SingletonPattern() {
    }

    // 共有创建实例的方法
    public static SingletonPattern getInstance() {
        if (singletonPattern == null) {
            singletonPattern = new SingletonPattern();
        }
        return singletonPattern;
    }
}
