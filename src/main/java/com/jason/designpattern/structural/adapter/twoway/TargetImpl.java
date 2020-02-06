package com.jason.designpattern.structural.adapter.twoway;

/**
 * @author ChenHol.Wong
 * @create 2020/2/6 14:40
 */
public class TargetImpl implements Target {
    @Override
    public void request() {
        System.out.println("抽象目标类实现类方法");
    }
}
