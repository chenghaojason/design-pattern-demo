package com.jason.designpattern.structural.adapter.power;

/**
 * 类适配器
 * 美国电源
 *
 * @author ChenHol.Wong
 * @create 2020/2/4 17:40
 */
public class AmericaPower implements Power {
    @Override
    public String standardVoltage() {
        System.out.print("美国标准交流电压-");
        return "110V";
    }

    @Override
    public String dc() {
        System.out.print("直流电-");
        return "24V";
    }
}
