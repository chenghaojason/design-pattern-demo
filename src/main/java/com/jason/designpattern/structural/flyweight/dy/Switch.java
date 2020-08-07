package com.jason.designpattern.structural.flyweight.dy;

/**
 * 具体享元类-交换机
 *
 * @author ChenHol.Wong
 * @create 2020/8/7 20:26
 */
public class Switch implements NetWorkDevice {
    private String type; // 内部状态：交换机型号

    public Switch(String type) {
        this.type = type;
    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public void use(Port port) {
        System.out.println("通过 交换机 链接，交换机型号：" + type + "  IP：" + port.getIp() + "  端口号：" + port.getPort());
    }
}
