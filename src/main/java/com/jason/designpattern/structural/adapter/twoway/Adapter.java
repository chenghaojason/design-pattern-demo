package com.jason.designpattern.structural.adapter.twoway;

/**
 * @author ChenHol.Wong
 * @create 2020/2/6 14:41
 */
public class Adapter implements Target, Adaptee {
    private Target target;
    private Adaptee adaptee;

    @Override
    public void response() {
        target.request();
    }

    @Override
    public void request() {
        adaptee.response();
    }

    public void setTarget(Target target) {
        this.target = target;
    }

    public void setAdaptee(Adaptee adaptee) {
        this.adaptee = adaptee;
    }
}
