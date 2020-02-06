package com.jason.designpattern.structural.adapter.dy;

/**
 * 类适配器
 * 适配器类
 *
 * @author ChenHol.Wong
 * @create 2020/2/4 16:56
 */
public class ClassAdapter extends ClassAdaptee implements ClassTarget {
    @Override
    public void request() {
        super.specificRequest();
    }
}
