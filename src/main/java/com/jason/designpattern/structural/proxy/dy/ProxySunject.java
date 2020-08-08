package com.jason.designpattern.structural.proxy.dy;

/**
 * @author ChenHol.Wong
 * @create 2020/8/8 14:11
 */
public class ProxySunject implements subject {

    private RealSubject realSubject = new RealSubject();

    protected void preRquest() {
        System.out.println("请求之前 do something ...");
    }

    @Override
    public void request() {
        preRquest();
        realSubject.request();
        postRequest();
    }

    protected void postRequest() {
        System.out.println("请求之后 do something ...");
    }
}
