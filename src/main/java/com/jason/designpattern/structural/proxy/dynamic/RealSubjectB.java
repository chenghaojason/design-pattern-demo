package com.jason.designpattern.structural.proxy.dynamic;

/**
 * 真实对象类 B
 *
 * @author ChenHol.Wong
 * @create 2020/8/8 19:57
 */
public class RealSubjectB implements AbstractSubject {
    @Override
    public void request() {
        System.out.println("真实对象 B 。。。");
    }
}
