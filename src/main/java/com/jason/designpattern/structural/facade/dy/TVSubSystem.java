package com.jason.designpattern.structural.facade.dy;

/**
 * 电视-子系统角色
 *
 * @author ChenHol.Wong
 * @create 2020/8/6 21:28
 */
public class TVSubSystem {
    public void on() {
        System.out.println("电视打开");
    }

    public void off() {
        System.out.println("电视关闭");
    }
}
