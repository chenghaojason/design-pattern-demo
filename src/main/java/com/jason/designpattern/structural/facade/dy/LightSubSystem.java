package com.jason.designpattern.structural.facade.dy;

/**
 * 灯-子系统角色
 *
 * @author ChenHol.Wong
 * @create 2020/8/6 21:24
 */
public class LightSubSystem {
    private String lightName;

    public LightSubSystem(String lightName) {
        this.lightName = lightName;
    }

    public void on() {
        System.out.println(lightName + "灯打开");
    }

    public void off() {
        System.out.println(lightName + "灯关闭");
    }
}
