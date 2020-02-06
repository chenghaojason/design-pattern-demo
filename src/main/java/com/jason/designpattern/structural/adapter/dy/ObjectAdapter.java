package com.jason.designpattern.structural.adapter.dy;

/**
 * 对象适配器
 * 适配器类
 *
 * @author ChenHol.Wong
 * @create 2020/2/4 17:04
 */
public class ObjectAdapter extends ObjectTarget {
    private ObjectAdaptee objectAdaptee;

    public ObjectAdapter(ObjectAdaptee objectAdaptee) {
        this.objectAdaptee = objectAdaptee;
    }

    @Override
    public void request() {
        objectAdaptee.specificRequest();
    }
}
