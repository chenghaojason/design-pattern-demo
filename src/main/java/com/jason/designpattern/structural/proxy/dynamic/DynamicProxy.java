package com.jason.designpattern.structural.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理类
 *
 * @author ChenHol.Wong
 * @create 2020/8/8 19:57
 */
public class DynamicProxy implements InvocationHandler {

    private Object object;

    public DynamicProxy(Object object) {
        this.object = object;
    }

    public void preRequest() {
        System.out.println("请求之前.......");
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        preRequest();
        method.invoke(object, args);
        prostRequest();
        return null;
    }

    public void prostRequest() {
        System.out.println("请求之后.......");
    }
}
