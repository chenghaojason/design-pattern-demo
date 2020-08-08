package com.jason.designpattern.structural.proxy;

import com.jason.designpattern.structural.proxy.dy.ProxySunject;
import com.jason.designpattern.structural.proxy.dynamic.AbstractSubject;
import com.jason.designpattern.structural.proxy.dynamic.DynamicProxy;
import com.jason.designpattern.structural.proxy.dynamic.RealSubjectA;
import com.jason.designpattern.structural.proxy.dynamic.RealSubjectB;
import com.jason.designpattern.structural.proxy.user.AbstractUser;
import com.jason.designpattern.structural.proxy.user.ProxyUser;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author ChenHol.Wong
 * @create 2020/8/8 14:13
 */
public class ProxyTest {
    public static void main(String[] args) {
        // 基本测试
        ProxySunject proxySunject = new ProxySunject();
        proxySunject.request();

        // 通过保护代理实现权限控制
        AbstractUser user = new ProxyUser();
        user.setLevel(1);
        user.selectDataList();
        user.deleteData();
        user.updateData();
        user.addData();

        user.setLevel(0);
        user.selectDataList();
        user.deleteData();
        user.updateData();
        user.addData();

        // 测试动态代理
        System.out.println("====== 测试动态代理 ========");
        InvocationHandler invocationHandler = null;
        AbstractSubject subject = null;

        invocationHandler = new DynamicProxy(new RealSubjectA());
        subject = (AbstractSubject) Proxy.newProxyInstance(AbstractSubject.class.getClassLoader(), new Class[]{AbstractSubject.class}, invocationHandler);
        subject.request();
        System.out.println("---------------------------");
        invocationHandler = new DynamicProxy(new RealSubjectB());
        subject = (AbstractSubject) Proxy.newProxyInstance(AbstractSubject.class.getClassLoader(), new Class[]{AbstractSubject.class}, invocationHandler);
        subject.request();
    }
}
