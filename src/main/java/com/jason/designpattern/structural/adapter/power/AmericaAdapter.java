package com.jason.designpattern.structural.adapter.power;

/**
 * 类适配器
 * 美国电源适配器-变压器
 *
 * @author ChenHol.Wong
 * @create 2020/2/4 17:55
 */
public class AmericaAdapter extends AmericaPower implements Transformer {
    @Override
    public String input() {
        System.out.println("输入：");
        return super.standardVoltage();
    }

    @Override
    public String output() {
        System.out.println("输出：");
        return super.dc();
    }
}
