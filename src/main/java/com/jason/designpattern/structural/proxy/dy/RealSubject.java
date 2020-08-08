package com.jason.designpattern.structural.proxy.dy;

/**
 * 真实角色
 * 需要被代理的对象
 *
 * @author ChenHol.Wong
 * @create 2020/8/8 14:10
 */
public class RealSubject implements subject {
    @Override
    public void request() {
        System.out.println("需要被代理的对象");
    }
}
