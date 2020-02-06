package com.jason.designpattern.structural.adapter.defaultadapter;

/**
 * 缺省适配器
 * 具体业务类
 *
 * @author ChenHol.Wong
 * @create 2020/2/6 14:30
 */
public class ServiceClass extends AbstractAdaptee {
    @Override
    public void start() {
        System.out.println("开始执行...");
    }

    @Override
    public void stop() {
        System.out.println("执行结束");
    }

}
