package com.jason.designpattern.structural.flyweight.dy;

/**
 * 感觉这模式就是在扯淡
 * 网络设备-抽象享元类
 *
 * @author ChenHol.Wong
 * @create 2020/8/7 20:24
 */
public interface NetWorkDevice {

    String getType();

    void use(Port port);

}
