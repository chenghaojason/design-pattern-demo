package com.jason.designpattern.create.singleton.dy;

/**
 * 饿汉式单例模式：（线程安全）
 *
 * @author ChenHol.Wong
 * @create 2020/1/31 15:29
 */
public class SingletonPatternHungry {

    private static final SingletonPatternHungry sing = new SingletonPatternHungry();

    private SingletonPatternHungry() {
    }

    public static SingletonPatternHungry getInstance() {
        return sing;
    }

}
