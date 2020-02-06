package com.jason.designpattern.structural.adapter.power;

/**
 * 电压
 *
 * @author ChenHol.Wong
 * @create 2020/2/4 17:47
 */
public interface Power {
    /**
     * 标准电压
     *
     * @return 标准电压
     */
    public String standardVoltage();

    /**
     * 直流电
     *
     * @return 输出电压
     */
    public String dc();
}
