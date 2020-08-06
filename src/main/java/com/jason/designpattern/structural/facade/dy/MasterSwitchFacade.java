package com.jason.designpattern.structural.facade.dy;

/**
 * 总开关-外观角色
 * 通过总开关控制两个灯、一个风扇、一个电视的开关
 *
 * @author ChenHol.Wong
 * @create 2020/8/6 21:29
 */
public class MasterSwitchFacade {

    private LightSubSystem[] lightSubSystems = new LightSubSystem[2];
    private FanSubSystem fanSubSystem;
    private TVSubSystem tvSubSystem;

    public MasterSwitchFacade() {
        lightSubSystems[0] = new LightSubSystem("客厅的");
        lightSubSystems[1] = new LightSubSystem("厨房的");
        fanSubSystem = new FanSubSystem();
        tvSubSystem = new TVSubSystem();
    }

    public void on() {
        lightSubSystems[0].on();
        lightSubSystems[1].on();
        fanSubSystem.on();
        tvSubSystem.on();
    }

    public void off() {
        lightSubSystems[0].off();
        lightSubSystems[1].off();
        fanSubSystem.off();
        tvSubSystem.off();
    }
}
