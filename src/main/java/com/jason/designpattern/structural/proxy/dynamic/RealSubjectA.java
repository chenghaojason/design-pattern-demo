package com.jason.designpattern.structural.proxy.dynamic;

/**
 * 真实对象类 A
 *
 * @author ChenHol.Wong
 * @create 2020/8/8 19:56
 */
public class RealSubjectA implements AbstractSubject {
    @Override
    public void request() {
        check();
        System.out.println("真实对象 A 。。。");
    }

    public void check() {
        System.out.println("真实对象 A 校验规则 。。。。");
    }
}
