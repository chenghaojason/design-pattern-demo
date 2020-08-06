package com.jason.designpattern.structural.facade.dy;

/**
 * 风扇-子系统角色
 *
 * @author ChenHol.Wong
 * @create 2020/8/6 21:27
 */
public class FanSubSystem {
    public void on() {
        System.out.println("风扇打开");
    }

    public void off() {
        System.out.println("风扇关闭");
    }
}
