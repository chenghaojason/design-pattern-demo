package com.jason.designpattern.structural.adapter.twoway;

/**
 * @author ChenHol.Wong
 * @create 2020/2/6 14:40
 */
public class AdapteeImpl implements Adaptee {
    @Override
    public void response() {
        System.out.println("适配者接口实现类方法");
    }
}
