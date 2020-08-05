package com.jason.designpattern.structural.Decorator.encrption;

/**
 * 抽象加密类
 *
 * @author ChenHol.Wong
 * @create 2020/8/5 20:46
 */
public interface Cipher {
    /**
     * 加密方法
     *
     * @param anyThing 任何待加密字符串
     * @return 加密后的字符串
     */
    String encrypt(String anyThing);
}
