package com.jason.designpattern.structural.adapter.power;

/**
 * 类适配器
 * 中国电源
 *
 * @author ChenHol.Wong
 * @create 2020/2/4 17:33
 */
public class ChinaPower implements Power {

    /**
     * 中国的标准电压
     *
     * @return 220V
     */
    public String standardVoltage() {
        System.out.print("中国标准交流电压-");
        return "220V";
    }

    public String dc() {
        System.out.print("直流电-");
        return "36V";
    }

    public String dc24v() {
        System.out.print("直流电-");
        return "24V";
    }

    public String dc12v() {
        System.out.print("直流电-");
        return "12V";
    }
}
